package com.adjust.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class GooglePlayServicesClient {

    public static final class GooglePlayServicesConnection implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public final long f288a;

        /* JADX INFO: renamed from: b */
        public boolean f289b = false;

        /* JADX INFO: renamed from: c */
        public final LinkedBlockingQueue f290c = new LinkedBlockingQueue(1);

        public GooglePlayServicesConnection(long j) {
            this.f288a = j;
        }

        /* JADX INFO: renamed from: a */
        public final IBinder m844a() {
            if (this.f289b) {
                throw new IllegalStateException();
            }
            this.f289b = true;
            return (IBinder) this.f290c.poll(this.f288a, TimeUnit.MILLISECONDS);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f290c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static final class GooglePlayServicesInfo {
        private final String gpsAdid;
        private final Boolean trackingEnabled;

        public GooglePlayServicesInfo(String str, Boolean bool) {
            this.gpsAdid = str;
            this.trackingEnabled = bool;
        }

        public String getGpsAdid() {
            return this.gpsAdid;
        }

        public Boolean isTrackingEnabled() {
            return this.trackingEnabled;
        }
    }

    public static final class GooglePlayServicesInterface implements IInterface {

        /* JADX INFO: renamed from: a */
        public final IBinder f291a;

        public GooglePlayServicesInterface(IBinder iBinder) {
            this.f291a = iBinder;
        }

        /* JADX INFO: renamed from: a */
        public final String m845a() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f291a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f291a;
        }

        /* JADX INFO: renamed from: b */
        public final Boolean m846b() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.f291a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return Boolean.valueOf(!(parcelObtain2.readInt() != 0));
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public static GooglePlayServicesInfo getGooglePlayServicesInfo(Context context, long j) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        GooglePlayServicesConnection googlePlayServicesConnection = new GooglePlayServicesConnection(j);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, googlePlayServicesConnection, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                GooglePlayServicesInterface googlePlayServicesInterface = new GooglePlayServicesInterface(googlePlayServicesConnection.m844a());
                GooglePlayServicesInfo googlePlayServicesInfo = new GooglePlayServicesInfo(googlePlayServicesInterface.m845a(), googlePlayServicesInterface.m846b());
                context.unbindService(googlePlayServicesConnection);
                return googlePlayServicesInfo;
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            context.unbindService(googlePlayServicesConnection);
            throw th;
        }
    }
}
