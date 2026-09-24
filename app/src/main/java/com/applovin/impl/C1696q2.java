package com.applovin.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import java.security.SecureRandom;

/* JADX INFO: renamed from: com.applovin.impl.q2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1696q2 {

    /* JADX INFO: renamed from: a */
    private final C1748l f2595a;

    /* JADX INFO: renamed from: b */
    private final C1768p f2596b;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.q2$a */
    static class a implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        private final C1768p f2597a;

        /* JADX INFO: renamed from: b */
        private final C1786u4 f2598b;

        public a(C1768p c1768p, C1786u4 c1786u4) {
            this.f2597a = c1768p;
            this.f2598b = c1786u4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m3963a() {
            try {
                C1748l.m4756p().unbindService(this);
            } catch (Exception e) {
                if (C1768p.m5160a()) {
                    this.f2597a.m5176d("LicenseVerificationManager", "Failed to unbind license service", e);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (C1768p.m5160a()) {
                this.f2597a.m5171a("LicenseVerificationManager", "License service connected: " + componentName);
            }
            int iNextInt = new SecureRandom().nextInt();
            b bVar = new b(this.f2597a, this.f2598b, iNextInt, new Runnable() { // from class: com.applovin.impl.q2$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3963a();
                }
            });
            Parcel parcelObtain = Parcel.obtain();
            try {
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                    parcelObtain.writeLong(iNextInt);
                    parcelObtain.writeString(C1748l.m4756p().getPackageName());
                    parcelObtain.writeStrongBinder(bVar);
                    if (!iBinder.transact(1, parcelObtain, null, 1)) {
                        throw new RemoteException("transact() returned false");
                    }
                    parcelObtain.recycle();
                } catch (Exception e) {
                    if (C1768p.m5160a()) {
                        this.f2597a.m5172a("LicenseVerificationManager", "Failed to check license", e);
                    }
                    m3963a();
                    this.f2598b.m5298a((Object) e);
                    parcelObtain.recycle();
                }
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IllegalStateException illegalStateException = new IllegalStateException("License service disconnected");
            if (C1768p.m5160a()) {
                this.f2597a.m5178k("LicenseVerificationManager", illegalStateException.getMessage());
            }
            this.f2598b.m5298a((Object) illegalStateException);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.q2$b */
    private static final class b extends Binder {

        /* JADX INFO: renamed from: a */
        private final C1768p f2599a;

        /* JADX INFO: renamed from: b */
        private final C1786u4 f2600b;

        /* JADX INFO: renamed from: c */
        private final int f2601c;

        /* JADX INFO: renamed from: d */
        private final Runnable f2602d;

        public b(C1768p c1768p, C1786u4 c1786u4, int i, Runnable runnable) {
            this.f2599a = c1768p;
            this.f2600b = c1786u4;
            this.f2601c = i;
            this.f2602d = runnable;
        }

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
            return "com.android.vending.licensing.ILicenseResultListener";
        }

        @Override // android.os.Binder
        protected boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            try {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                int i3 = parcel.readInt();
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (C1768p.m5160a()) {
                    this.f2599a.m5171a("LicenseVerificationManager", "Verified with code " + i3);
                }
                this.f2600b.m5303b(C1706r2.m4164a().m4174b(string).m4171a(string2).m4173b(i3).m4170a(this.f2601c).m4172a());
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                this.f2602d.run();
                return true;
            } catch (Throwable th) {
                try {
                    if (C1768p.m5160a()) {
                        this.f2599a.m5172a("LicenseVerificationManager", "Exception handling verifyLicense callback", th);
                    }
                    this.f2600b.m5298a((Object) new Exception(th));
                    return false;
                } finally {
                    this.f2602d.run();
                }
            }
        }
    }

    public C1696q2(C1748l c1748l) {
        this.f2595a = c1748l;
        this.f2596b = c1748l.m4782Q();
    }

    /* JADX INFO: renamed from: a */
    public C1786u4 m3962a(long j) {
        C1786u4 c1786u4 = new C1786u4("verify_license");
        if (j > 0) {
            C1612l6.m3141a(j, c1786u4, new Exception("License Verification Timed Out"), "verify_license_timeout", this.f2595a);
        }
        try {
            if (!C1748l.m4756p().bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), new a(this.f2596b, c1786u4), 1)) {
                Exception exc = new Exception("Failed to bind to license service");
                if (C1768p.m5160a()) {
                    this.f2596b.m5178k("LicenseVerificationManager", exc.getMessage());
                }
                c1786u4.m5298a((Object) exc);
                return c1786u4;
            }
        } catch (Exception e) {
            if (C1768p.m5160a()) {
                this.f2596b.m5172a("LicenseVerificationManager", "Failed to verify license", e);
            }
            c1786u4.m5298a((Object) e);
        }
        return c1786u4;
    }
}
