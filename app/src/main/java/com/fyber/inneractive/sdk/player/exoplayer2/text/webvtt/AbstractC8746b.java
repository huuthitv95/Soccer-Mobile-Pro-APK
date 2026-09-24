package com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt;

import com.facebook.internal.security.CertificateUtil;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8746b {

    /* JADX INFO: renamed from: a */
    public static final Pattern f20432a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f20433b = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    /* JADX INFO: renamed from: a */
    public static long m21281a(String str) {
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(CertificateUtil.DELIMITER)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        return (Long.parseLong(strArrSplit[1]) + (j * 1000)) * 1000;
    }
}
