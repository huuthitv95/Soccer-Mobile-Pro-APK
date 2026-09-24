package com.mbridge.msdk.foundation.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.c */
/* JADX INFO: compiled from: AdvertisingIdClient.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13186c {

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.c$b */
    /* JADX INFO: compiled from: AdvertisingIdClient.java */
    public final class b {

        /* JADX INFO: renamed from: a */
        private final String f36250a;

        /* JADX INFO: renamed from: b */
        private final boolean f36251b;

        b(String str, boolean z) {
            this.f36250a = str;
            this.f36251b = z;
        }

        /* JADX INFO: renamed from: a */
        public String m37639a() {
            return this.f36250a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m37640b() {
            return this.f36251b;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.c$c */
    /* JADX INFO: compiled from: AdvertisingIdClient.java */
    private final class c implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        private final LinkedBlockingQueue<IBinder> f36253a;

        /* JADX INFO: renamed from: b */
        boolean f36254b;

        private c() {
            this.f36253a = new LinkedBlockingQueue<>(1);
            this.f36254b = false;
        }

        /* JADX INFO: renamed from: a */
        public IBinder m37641a() throws InterruptedException {
            if (this.f36254b) {
                throw new IllegalStateException();
            }
            this.f36254b = true;
            return this.f36253a.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f36253a.put(iBinder);
            } catch (InterruptedException e) {
                C13219q0.m37816b("AdvertisingIdClient", e.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.c$d */
    /* JADX INFO: compiled from: AdvertisingIdClient.java */
    private final class d implements IInterface {

        /* JADX INFO: renamed from: a */
        private IBinder f36256a;

        public d(IBinder iBinder) {
            this.f36256a = iBinder;
        }

        /* JADX INFO: renamed from: a */
        public boolean m37642a(boolean z) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z ? 1 : 0);
                this.f36256a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                boolean z2 = parcelObtain2.readInt() != 0;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return z2;
            } catch (Throwable th) {
                try {
                    C13219q0.m37816b("AdvertisingIdClient", th.getMessage());
                    return false;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f36256a;
        }

        public String getId() throws RemoteException {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f36256a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable th) {
                try {
                    C13219q0.m37816b("AdvertisingIdClient", th.getMessage());
                    string = null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
            return string;
        }
    }

    /* JADX INFO: renamed from: a */
    public b m37638a(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        c cVar = new c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, cVar, 1)) {
            throw new IOException("Google Play connection failed");
        }
        try {
            try {
                d dVar = new d(cVar.m37641a());
                b bVar = new b(dVar.getId(), dVar.m37642a(true));
                context.unbindService(cVar);
                return bVar;
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            context.unbindService(cVar);
            throw th;
        }
    }
}
