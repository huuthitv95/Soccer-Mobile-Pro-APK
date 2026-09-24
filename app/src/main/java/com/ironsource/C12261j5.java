package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.j5 */
/* JADX INFO: loaded from: classes6.dex */
public class C12261j5 {

    /* JADX INFO: renamed from: d */
    public static final int f30655d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f30656e = 2;

    /* JADX INFO: renamed from: f */
    public static final String f30657f = "C38FB23A402222A0C17D34A92F971D1F";

    /* JADX INFO: renamed from: g */
    public static final String f30658g = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB";

    /* JADX INFO: renamed from: h */
    public static final String f30659h = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    /* JADX INFO: renamed from: i */
    public static final int f30660i = 32;

    /* JADX INFO: renamed from: j */
    private static final C12261j5 f30661j = new C12261j5();

    /* JADX INFO: renamed from: a */
    private String f30662a = "";

    /* JADX INFO: renamed from: b */
    private String f30663b = "";

    /* JADX INFO: renamed from: c */
    private String f30664c = "";

    /* JADX INFO: renamed from: a */
    private String m31852a(String str, int i) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(str.charAt(random.nextInt(str.length())));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static C12261j5 m31853b() {
        return f30661j;
    }

    /* JADX INFO: renamed from: c */
    public String m31855c() {
        if (TextUtils.isEmpty(this.f30662a)) {
            this.f30662a = f30657f;
        }
        return this.f30662a;
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m31856d() {
        if (TextUtils.isEmpty(this.f30663b)) {
            this.f30663b = m31852a(f30659h, 32);
        }
        return this.f30663b;
    }

    /* JADX INFO: renamed from: a */
    public String m31854a() throws JSONException {
        if (TextUtils.isEmpty(this.f30664c)) {
            try {
                this.f30664c = C11750X9.m27943a(m31856d(), f30658g);
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                String str = "Session key encryption exception: " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f30664c;
    }
}
