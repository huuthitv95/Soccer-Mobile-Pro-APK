package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C8685b;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.AbstractC8700o;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C8695j;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C8571m {

    /* JADX INFO: renamed from: c */
    public static final Pattern f19382c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f19383a = -1;

    /* JADX INFO: renamed from: b */
    public int f19384b = -1;

    /* JADX INFO: renamed from: a */
    public final void m21109a(C8685b c8685b) {
        int i = 0;
        while (true) {
            AbstractC8700o[] abstractC8700oArr = c8685b.f20253a;
            if (i >= abstractC8700oArr.length) {
                return;
            }
            AbstractC8700o abstractC8700o = abstractC8700oArr[i];
            if (abstractC8700o instanceof C8695j) {
                C8695j c8695j = (C8695j) abstractC8700o;
                String str = c8695j.f20271c;
                String str2 = c8695j.f20272d;
                if ("iTunSMPB".equals(str)) {
                    Matcher matcher = f19382c.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int i2 = Integer.parseInt(matcher.group(1), 16);
                            int i3 = Integer.parseInt(matcher.group(2), 16);
                            if (i2 > 0 || i3 > 0) {
                                this.f19383a = i2;
                                this.f19384b = i3;
                                return;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }
}
