package com.bykv.p028vk.openvk.p049ri.p050ri.p051lr;

import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p064ri.InterfaceC2005lr;
import com.ironsource.C12538u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C1979ri {

    /* JADX INFO: renamed from: di */
    private static boolean f4558di = false;

    /* JADX INFO: renamed from: fi */
    private static InterfaceC2005lr f4559fi = null;

    /* JADX INFO: renamed from: ik */
    public static int f4560ik = 10;

    /* JADX INFO: renamed from: ka */
    public static int f4561ka = 10;

    /* JADX INFO: renamed from: lr */
    public static int f4562lr = 10;

    /* JADX INFO: renamed from: mj */
    private static int f4563mj = 8192;

    /* JADX INFO: renamed from: ri */
    public static int f4564ri = 10;
    private static int xha = 1;

    /* JADX INFO: renamed from: di */
    public static int m6211di() {
        return xha;
    }

    /* JADX INFO: renamed from: fi */
    public static int m6212fi() {
        return f4561ka;
    }

    /* JADX INFO: renamed from: ik */
    public static int m6213ik() {
        return f4562lr;
    }

    /* JADX INFO: renamed from: ka */
    public static int m6214ka() {
        return f4560ik;
    }

    /* JADX INFO: renamed from: lr */
    public static int m6215lr() {
        return f4564ri;
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m6216lr(String str) {
        return f4558di && str != null && str.endsWith(".mp4");
    }

    /* JADX INFO: renamed from: ri */
    public static void m6217ri() {
        InterfaceC2005lr interfaceC2005lr = f4559fi;
        if (interfaceC2005lr != null) {
            interfaceC2005lr.mo6271ka();
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m6218ri(InterfaceC2005lr interfaceC2005lr) {
        f4559fi = interfaceC2005lr;
    }

    /* JADX INFO: renamed from: ri */
    public static void m6219ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            f4558di = jSONObject.optInt("check_moov", 0) == 1;
            xha = jSONObject.optInt("new_media_source", 1);
            f4563mj = jSONObject.optInt("read_buffer_size_k", 8) * 1024;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m6220ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            f4564ri = jSONObject.optInt("splash", 10);
            f4562lr = jSONObject.optInt(C12538u.f32489j, 10);
            f4560ik = jSONObject.optInt("brand", 10);
            int iOptInt = jSONObject.optInt("other", 10);
            f4561ka = iOptInt;
            if (f4564ri < 0) {
                f4564ri = 10;
            }
            if (f4562lr < 0) {
                f4562lr = 10;
            }
            if (f4560ik < 0) {
                f4560ik = 10;
            }
            if (iOptInt < 0) {
                f4561ka = 10;
            }
            Integer.valueOf(f4564ri);
            Integer.valueOf(f4562lr);
            Integer.valueOf(f4560ik);
            Integer.valueOf(f4561ka);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static int xha() {
        return f4563mj;
    }
}
