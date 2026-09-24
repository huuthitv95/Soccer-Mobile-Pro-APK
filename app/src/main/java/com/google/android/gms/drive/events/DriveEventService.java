package com.google.android.gms.drive.events;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.drive.zzet;
import com.google.android.gms.internal.drive.zzfp;
import com.google.android.gms.internal.drive.zzir;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class DriveEventService extends Service implements ChangeListener, CompletionListener, zzd, zzi {
    public static final String ACTION_HANDLE_EVENT = "com.google.android.gms.drive.events.HANDLE_EVENT";
    private static final GmsLogger zzbz = new GmsLogger("DriveEventService", "");
    private final String name;
    private CountDownLatch zzcj;
    zza zzck;
    boolean zzcl;
    private int zzcm;

    static final class zza extends zzir {
        private final WeakReference<DriveEventService> zzcp;

        private zza(DriveEventService driveEventService) {
            this.zzcp = new WeakReference<>(driveEventService);
        }

        /* synthetic */ zza(DriveEventService driveEventService, zzh zzhVar) {
            this(driveEventService);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Message zzb(zzfp zzfpVar) {
            return obtainMessage(1, zzfpVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Message zzy() {
            return obtainMessage(2);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    DriveEventService.zzbz.wfmt("DriveEventService", "Unexpected message type: %s", Integer.valueOf(message.what));
                    return;
                } else {
                    getLooper().quit();
                    return;
                }
            }
            DriveEventService driveEventService = this.zzcp.get();
            if (driveEventService != null) {
                driveEventService.zza((zzfp) message.obj);
            } else {
                getLooper().quit();
            }
        }
    }

    final class zzb extends zzet {
        private zzb() {
        }

        /* synthetic */ zzb(DriveEventService driveEventService, zzh zzhVar) {
            this();
        }

        @Override // com.google.android.gms.internal.drive.zzes
        public final void zzc(zzfp zzfpVar) throws RemoteException {
            synchronized (DriveEventService.this) {
                DriveEventService.this.zzw();
                if (DriveEventService.this.zzck != null) {
                    DriveEventService.this.zzck.sendMessage(DriveEventService.this.zzck.zzb(zzfpVar));
                } else {
                    DriveEventService.zzbz.m22265e("DriveEventService", "Receiving event before initialize is completed.");
                }
            }
        }
    }

    protected DriveEventService() {
        this("DriveEventService");
    }

    protected DriveEventService(String str) {
        this.zzcl = false;
        this.zzcm = -1;
        this.name = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzfp zzfpVar) {
        DriveEvent driveEventZzat = zzfpVar.zzat();
        try {
            int type = driveEventZzat.getType();
            if (type == 1) {
                onChange((ChangeEvent) driveEventZzat);
                return;
            }
            if (type == 2) {
                onCompletion((CompletionEvent) driveEventZzat);
                return;
            }
            if (type == 4) {
                zza((com.google.android.gms.drive.events.zzb) driveEventZzat);
            } else if (type != 7) {
                zzbz.wfmt("DriveEventService", "Unhandled event: %s", driveEventZzat);
            } else {
                zzbz.wfmt("DriveEventService", "Unhandled transfer state event in %s: %s", this.name, (zzv) driveEventZzat);
            }
        } catch (Exception e) {
            zzbz.m22266e("DriveEventService", String.format("Error handling event in %s", this.name), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw() throws SecurityException {
        int callingUid = getCallingUid();
        if (callingUid == this.zzcm) {
            return;
        }
        if (!UidVerifier.isGooglePlayServicesUid(this, callingUid)) {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
        this.zzcm = callingUid;
    }

    protected int getCallingUid() {
        return Binder.getCallingUid();
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        zzh zzhVar = null;
        if (!ACTION_HANDLE_EVENT.equals(intent.getAction())) {
            return null;
        }
        if (this.zzck == null && !this.zzcl) {
            this.zzcl = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.zzcj = new CountDownLatch(1);
            new zzh(this, countDownLatch).start();
            try {
                if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                    zzbz.m22265e("DriveEventService", "Failed to synchronously initialize event handler.");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException("Unable to start event handler", e);
            }
        }
        return new zzb(this, zzhVar).asBinder();
    }

    @Override // com.google.android.gms.drive.events.ChangeListener
    public void onChange(ChangeEvent changeEvent) {
        zzbz.wfmt("DriveEventService", "Unhandled change event in %s: %s", this.name, changeEvent);
    }

    @Override // com.google.android.gms.drive.events.CompletionListener
    public void onCompletion(CompletionEvent completionEvent) {
        zzbz.wfmt("DriveEventService", "Unhandled completion event in %s: %s", this.name, completionEvent);
    }

    @Override // android.app.Service
    public synchronized void onDestroy() {
        zza zzaVar = this.zzck;
        if (zzaVar != null) {
            this.zzck.sendMessage(zzaVar.zzy());
            this.zzck = null;
            try {
                if (!this.zzcj.await(5000L, TimeUnit.MILLISECONDS)) {
                    zzbz.m22271w("DriveEventService", "Failed to synchronously quit event handler. Will quit itself");
                }
            } catch (InterruptedException unused) {
            }
            this.zzcj = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return true;
    }

    @Override // com.google.android.gms.drive.events.zzd
    public final void zza(com.google.android.gms.drive.events.zzb zzbVar) {
        zzbz.wfmt("DriveEventService", "Unhandled changes available event in %s: %s", this.name, zzbVar);
    }
}
