package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C8776m extends AbstractC8770g {

    /* JADX INFO: renamed from: g */
    public static final Pattern f20514g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: h */
    public static final Pattern f20515h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: i */
    public static final Pattern f20516i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public C8776m(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    /* JADX INFO: renamed from: a */
    public static C8776m m21306a(File file, C8772i c8772i) {
        File file2;
        String strGroup;
        File file3;
        C8771h c8771hM21295a;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = f20515h.matcher(name2);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                int i = AbstractC8827z.f20671a;
                int length = strGroup.length();
                int iEnd = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (strGroup.charAt(i3) == '%') {
                        i2++;
                    }
                }
                if (i2 != 0) {
                    int i4 = length - (i2 * 2);
                    StringBuilder sb = new StringBuilder(i4);
                    Matcher matcher2 = AbstractC8827z.f20677g.matcher(strGroup);
                    while (i2 > 0 && matcher2.find()) {
                        char c = (char) Integer.parseInt(matcher2.group(1), 16);
                        sb.append((CharSequence) strGroup, iEnd, matcher2.start());
                        sb.append(c);
                        iEnd = matcher2.end();
                        i2--;
                    }
                    if (iEnd < length) {
                        sb.append((CharSequence) strGroup, iEnd, length);
                    }
                    strGroup = sb.length() != i4 ? null : sb.toString();
                }
                if (strGroup != null) {
                    File parentFile = file.getParentFile();
                    c8771hM21295a = (C8771h) c8772i.f20497a.get(strGroup);
                    if (c8771hM21295a == null) {
                        c8771hM21295a = c8772i.m21295a(strGroup, -1L);
                    }
                    file3 = new File(parentFile, c8771hM21295a.f20493a + "." + Long.parseLong(matcher.group(2)) + "." + Long.parseLong(matcher.group(3)) + ".v3.exo");
                    if (!file.renameTo(file3)) {
                    }
                }
                if (file3 == null) {
                    return null;
                }
                name = file3.getName();
                file2 = file3;
            } else {
                matcher = f20514g.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    File parentFile2 = file.getParentFile();
                    c8771hM21295a = (C8771h) c8772i.f20497a.get(strGroup);
                    if (c8771hM21295a == null) {
                        c8771hM21295a = c8772i.m21295a(strGroup, -1L);
                    }
                    file3 = new File(parentFile2, c8771hM21295a.f20493a + "." + Long.parseLong(matcher.group(2)) + "." + Long.parseLong(matcher.group(3)) + ".v3.exo");
                    if (!file.renameTo(file3)) {
                    }
                }
                if (file3 == null) {
                    return null;
                }
                name = file3.getName();
                file2 = file3;
            }
            file3 = null;
            if (file3 == null) {
                return null;
            }
            name = file3.getName();
            file2 = file3;
        }
        Matcher matcher3 = f20516i.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        long length2 = file2.length();
        String str = (String) c8772i.f20498b.get(Integer.parseInt(matcher3.group(1)));
        if (str == null) {
            return null;
        }
        return new C8776m(str, Long.parseLong(matcher3.group(2)), length2, Long.parseLong(matcher3.group(3)), file2);
    }
}
