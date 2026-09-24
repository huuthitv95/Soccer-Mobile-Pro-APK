package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.google.common.net.HttpHeaders;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.c1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9222c1 {

    /* JADX INFO: renamed from: g */
    public static final Pattern f21528g = Pattern.compile("max-age=(\\d+)");

    /* JADX INFO: renamed from: h */
    public static final SimpleDateFormat f21529h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);

    /* JADX INFO: renamed from: a */
    public final byte[] f21530a;

    /* JADX INFO: renamed from: b */
    public final Map f21531b;

    /* JADX INFO: renamed from: c */
    public final String f21532c;

    /* JADX INFO: renamed from: d */
    public final String f21533d;

    /* JADX INFO: renamed from: e */
    public final int f21534e;

    /* JADX INFO: renamed from: f */
    public final String f21535f;

    public C9222c1(byte[] bArr, HashMap map, String str, String str2, int i, String str3) {
        this.f21530a = bArr;
        this.f21531b = map;
        this.f21532c = str;
        this.f21533d = str2;
        this.f21534e = i;
        this.f21535f = str3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m22051a() {
        boolean z;
        String str;
        if (TextUtils.isEmpty(this.f21535f)) {
            return false;
        }
        loop0: while (true) {
            z = true;
            for (String str2 : this.f21531b.keySet()) {
                if (!z) {
                    break loop0;
                }
                if (str2 == null || !str2.equalsIgnoreCase(HttpHeaders.CACHE_CONTROL)) {
                    if (str2 == null || !str2.equalsIgnoreCase(HttpHeaders.VARY)) {
                        if (str2 != null && str2.equalsIgnoreCase(HttpHeaders.PRAGMA)) {
                            String str3 = (String) this.f21531b.get(str2);
                            if (str3 != null) {
                                z = !str3.equalsIgnoreCase("no-cache");
                            }
                        } else if (str2 != null && str2.equalsIgnoreCase(HttpHeaders.EXPIRES) && (str = (String) this.f21531b.get(str2)) != null) {
                            try {
                                Date date = f21529h.parse(str);
                                if (date != null && date.getTime() + TimeUnit.MILLISECONDS.convert(1L, TimeUnit.HOURS) > System.currentTimeMillis()) {
                                }
                            } catch (ParseException unused) {
                                continue;
                            }
                        }
                    }
                    z = false;
                } else {
                    String str4 = (String) this.f21531b.get(str2);
                    if (str4 != null) {
                        Pattern pattern = f21528g;
                        Locale locale = Locale.ENGLISH;
                        Matcher matcher = pattern.matcher(str4.toLowerCase(locale));
                        int iM22022a = (matcher.find() && matcher.groupCount() == 1) ? AbstractC9195v.m22022a(matcher.group(1), 0) : 0;
                        if ((str4.toLowerCase(locale).contains("public") || str4.toLowerCase(locale).contains("private") || iM22022a > TimeUnit.SECONDS.convert(1L, TimeUnit.HOURS)) && !str4.toLowerCase(locale).contains("no-") && !str4.toLowerCase(locale).contains("must-")) {
                        }
                        z = false;
                    } else {
                        continue;
                    }
                }
            }
            break loop0;
        }
        return z;
    }
}
