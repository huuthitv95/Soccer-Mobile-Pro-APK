package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.cache.C7911m;
import com.fyber.inneractive.sdk.cache.InterfaceC7899a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.d0 */
/* JADX INFO: loaded from: classes4.dex */
public class C8366d0 {

    /* JADX INFO: renamed from: a */
    public final Context f18631a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7899a f18632b;

    /* JADX INFO: renamed from: c */
    public SharedPreferences f18633c;

    public C8366d0(Context context, InterfaceC7899a interfaceC7899a) {
        this.f18631a = context;
        this.f18632b = interfaceC7899a;
    }

    /* JADX INFO: renamed from: a */
    public C7911m mo20736a() throws Throwable {
        try {
            if (!this.f18632b.mo20354d()) {
                new C8363c0();
                return new C7911m();
            }
            Object objMo20349a = this.f18632b.mo20349a(m20737a(this.f18632b.mo20353c()));
            if (this.f18633c == null) {
                this.f18633c = this.f18631a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            return new C7911m(objMo20349a, this.f18633c.getString(this.f18632b.mo20352b(), null));
        } catch (Exception unused) {
            m20739b();
            return new C7911m();
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m20737a(String str) throws Throwable {
        FileInputStream fileInputStreamOpenFileInput;
        IAlog.m21945a("reading local file: %s", str);
        FileInputStream fileInputStream = null;
        str = null;
        str = null;
        String str2 = null;
        try {
            fileInputStreamOpenFileInput = this.f18631a.openFileInput(str);
            try {
                try {
                    byte[] bArr = new byte[fileInputStreamOpenFileInput.available()];
                    fileInputStreamOpenFileInput.read(bArr);
                    String str3 = new String(bArr, "UTF-8");
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (Exception e) {
                        IAlog.m21950f("Failed closing local file: %s", e.getMessage());
                    }
                    str2 = str3;
                } catch (Exception e2) {
                    e = e2;
                    if (e instanceof FileNotFoundException) {
                        throw new FileNotFoundException();
                    }
                    IAlog.m21945a("Failed reading local file: %s", e.getMessage());
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (Exception e3) {
                            IAlog.m21950f("Failed closing local file: %s", e3.getMessage());
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStreamOpenFileInput;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception e4) {
                        IAlog.m21950f("Failed closing local file: %s", e4.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th2) {
            th = th2;
        }
        IAlog.m21945a("local file %s read successfully", str);
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX INFO: renamed from: a */
    public boolean mo20738a(String str, String str2) {
        boolean z;
        int i = 1;
        i = 1;
        i = 1;
        IAlog.m21945a("caching file %s", str);
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            try {
                fileOutputStreamOpenFileOutput = this.f18631a.openFileOutput(str, 0);
                fileOutputStreamOpenFileOutput.write(str2.getBytes());
                try {
                    IAlog.m21945a("File cached successfully", new Object[0]);
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e) {
                        IAlog.m21950f("Failed closing cache file: %s", e.getMessage());
                    }
                } catch (Exception e2) {
                    e = e2;
                    z = true;
                    IAlog.m21950f("Failed caching file: %s", e.getMessage());
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (Exception e3) {
                            IAlog.m21950f("Failed closing cache file: %s", e3.getMessage());
                        }
                    }
                    i = z;
                }
            } catch (Throwable th) {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e4) {
                        Object[] objArr = new Object[i];
                        objArr[0] = e4.getMessage();
                        IAlog.m21950f("Failed closing cache file: %s", objArr);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            z = false;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final void m20739b() {
        if (this.f18633c == null) {
            this.f18633c = this.f18631a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.f18633c.edit().remove(this.f18632b.mo20352b()).apply();
    }

    /* JADX INFO: renamed from: b */
    public final void m20740b(String str) {
        if (this.f18633c == null) {
            this.f18633c = this.f18631a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.f18633c.edit().putString(this.f18632b.mo20352b(), str).apply();
    }
}
