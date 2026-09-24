package com.fyber.inneractive.sdk.network;

import android.os.Environment;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C9273x;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.b1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8361b1 extends AbstractC8416t0 {

    /* JADX INFO: renamed from: p */
    public final String f18625p;

    public C8361b1(C9273x c9273x, String str, C8006r c8006r) {
        super(c9273x, C8377g0.f18655c.m20755a(), c8006r);
        this.f18625p = str;
    }

    /* JADX INFO: renamed from: a */
    public static String m20735a(URI uri, Map map) {
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        String name = new File(path).getName();
        List list = map != null ? (List) map.get("Content-Type") : null;
        String str = list != null ? (String) list.get(0) : null;
        if (str != null) {
            for (String str2 : str.split(";")) {
                if (str2.contains("image/")) {
                    String str3 = "." + str2.split(RemoteSettings.FORWARD_SLASH_STRING)[1];
                    if (name.endsWith(str3)) {
                        break;
                    }
                    return name + str3;
                }
            }
        }
        return name;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final C8401o0 mo20620a(C8391l c8391l, Map map, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        String string;
        C8401o0 c8401o0 = new C8401o0();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                InputStream inputStream = c8391l.f18668c;
                File file = new File(Environment.getExternalStorageDirectory(), "Pictures");
                file.mkdirs();
                String strM20735a = m20735a(URI.create(this.f18625p), map);
                if (TextUtils.isEmpty(strM20735a)) {
                    string = null;
                } else {
                    File file2 = new File(file, strM20735a);
                    string = file2.toString();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        AbstractC9195v.m22029a(inputStream, fileOutputStream);
                        fileOutputStream2 = fileOutputStream;
                    } catch (Exception unused) {
                        fileOutputStream2 = fileOutputStream;
                        IAlog.m21945a("failed to download and save the image file.", new Object[0]);
                    } catch (Throwable th) {
                        th = th;
                        AbstractC9195v.m22034b(fileOutputStream);
                        throw th;
                    }
                }
                c8401o0.f18690a = string;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception unused2) {
        }
        AbstractC9195v.m22034b(fileOutputStream2);
        return c8401o0;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: g */
    public final int mo20728g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: m */
    public final EnumC8395m0 mo20729m() {
        return EnumC8395m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: o */
    public final EnumC8378g1 mo20731o() {
        return EnumC8378g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: r */
    public final String mo20732r() {
        return this.f18625p;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: u */
    public final boolean mo20733u() {
        return false;
    }
}
