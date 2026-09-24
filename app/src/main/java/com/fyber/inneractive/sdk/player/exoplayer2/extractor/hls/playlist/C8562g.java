package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.text.TextUtils;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8515b;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8763c0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C8562g implements InterfaceC8763c0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f19336a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: b */
    public static final Pattern f19337b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: c */
    public static final Pattern f19338c = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: d */
    public static final Pattern f19339d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: e */
    public static final Pattern f19340e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: f */
    public static final Pattern f19341f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: g */
    public static final Pattern f19342g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: h */
    public static final Pattern f19343h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: i */
    public static final Pattern f19344i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: j */
    public static final Pattern f19345j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k */
    public static final Pattern f19346k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: l */
    public static final Pattern f19347l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: m */
    public static final Pattern f19348m = Pattern.compile("METHOD=(NONE|AES-128)");

    /* JADX INFO: renamed from: n */
    public static final Pattern f19349n = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: o */
    public static final Pattern f19350o = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: p */
    public static final Pattern f19351p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: q */
    public static final Pattern f19352q = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: r */
    public static final Pattern f19353r = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: s */
    public static final Pattern f19354s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: t */
    public static final Pattern f19355t = Pattern.compile("AUTOSELECT".concat("=(NO|YES)"));

    /* JADX INFO: renamed from: u */
    public static final Pattern f19356u = Pattern.compile(MessengerShareContentUtility.PREVIEW_DEFAULT.concat("=(NO|YES)"));

    /* JADX INFO: renamed from: v */
    public static final Pattern f19357v = Pattern.compile("FORCED".concat("=(NO|YES)"));

    /* JADX WARN: Code duplicated, block: B:72:0x021f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static C8557b m21100a(C8561f c8561f, String str) throws C8711r {
        String str2;
        int i;
        String str3;
        int i2;
        int i3;
        String str4;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C8708o c8708o = null;
        List arrayList4 = null;
        boolean zContains = false;
        while (c8561f.m21099a()) {
            if (c8561f.m21099a()) {
                str2 = c8561f.f19335c;
                c8561f.f19335c = null;
            } else {
                str2 = null;
            }
            if (str2.startsWith("#EXT-X-MEDIA")) {
                Matcher matcher = f19356u.matcher(str2);
                boolean zEquals = matcher.find() ? matcher.group(1).equals("YES") : 0;
                Matcher matcher2 = f19357v.matcher(str2);
                int i4 = zEquals | (matcher2.find() ? matcher2.group(1).equals("YES") : false ? 2 : 0);
                Matcher matcher3 = f19355t.matcher(str2);
                int i5 = i4 | (matcher3.find() ? matcher3.group(1).equals("YES") : false ? 4 : 0);
                String strM21101a = m21101a(str2, f19349n);
                String strM21103b = m21103b(str2, f19353r);
                String strM21101a2 = m21101a(str2, f19352q);
                String strM21103b2 = m21103b(str2, f19351p);
                strM21103b2.getClass();
                strM21103b2.hashCode();
                switch (strM21103b2) {
                    case "SUBTITLES":
                        arrayList3.add(new C8556a(strM21101a, new C8708o(strM21103b, "application/x-mpegURL", "text/vtt", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, strM21101a2, -1, Long.MAX_VALUE, null, null, null)));
                        break;
                    case "CLOSED-CAPTIONS":
                        String strM21103b3 = m21103b(str2, f19354s);
                        if (strM21103b3.startsWith("CC")) {
                            i = Integer.parseInt(strM21103b3.substring(2));
                            str3 = "application/cea-608";
                        } else {
                            i = Integer.parseInt(strM21103b3.substring(7));
                            str3 = "application/cea-708";
                        }
                        int i6 = i;
                        String str5 = str3;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(new C8708o(strM21103b, null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, strM21101a2, i6, Long.MAX_VALUE, null, null, null));
                        break;
                    case "AUDIO":
                        C8708o c8708o2 = new C8708o(strM21103b, "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, strM21101a2, -1, Long.MAX_VALUE, null, null, null);
                        if (strM21101a != null) {
                            arrayList2.add(new C8556a(strM21101a, c8708o2));
                            break;
                        } else {
                            c8708o = c8708o2;
                            break;
                        }
                        break;
                }
            } else if (str2.startsWith("#EXT-X-STREAM-INF")) {
                int i7 = Integer.parseInt(m21103b(str2, f19337b));
                String strM21101a3 = m21101a(str2, f19336a);
                if (strM21101a3 != null) {
                    i7 = Integer.parseInt(strM21101a3);
                }
                int i8 = i7;
                String strM21101a4 = m21101a(str2, f19338c);
                String strM21101a5 = m21101a(str2, f19339d);
                zContains |= str2.contains("CLOSED-CAPTIONS=NONE");
                if (strM21101a5 != null) {
                    String[] strArrSplit = strM21101a5.split("x");
                    int i9 = Integer.parseInt(strArrSplit[0]);
                    int i10 = Integer.parseInt(strArrSplit[1]);
                    if (i9 <= 0 || i10 <= 0) {
                        i2 = -1;
                        i3 = -1;
                    } else {
                        i3 = i10;
                        i2 = i9;
                    }
                } else {
                    i2 = -1;
                    i3 = -1;
                }
                if (c8561f.m21099a()) {
                    str4 = c8561f.f19335c;
                    c8561f.f19335c = null;
                } else {
                    str4 = null;
                }
                if (hashSet.add(str4)) {
                    arrayList.add(new C8556a(str4, new C8708o(Integer.toString(arrayList.size()), "application/x-mpegURL", null, strM21101a4, i8, -1, i2, i3, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
                }
            }
        }
        if (zContains) {
            arrayList4 = Collections.EMPTY_LIST;
        }
        return new C8557b(str, arrayList, arrayList2, arrayList3, c8708o, arrayList4);
    }

    /* JADX INFO: renamed from: a */
    public static String m21101a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C8559d m21102b(C8561f c8561f, String str) throws C8711r {
        String str2;
        int i;
        String hexString;
        c8561f = c8561f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean zEquals = false;
        long j = -9223372036854775807L;
        C8558c c8558c = null;
        String strM21103b = null;
        String strM21101a = null;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = -1;
        int i5 = 1;
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        long j7 = -9223372036854775807L;
        while (c8561f.m21099a()) {
            if (c8561f.m21099a()) {
                str2 = c8561f.f19335c;
                c8561f.f19335c = str3;
            } else {
                str2 = str3;
            }
            if (str2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strM21103b2 = m21103b(str2, f19342g);
                if ("VOD".equals(strM21103b2)) {
                    c8561f = c8561f;
                    str3 = null;
                    i2 = 1;
                } else if ("EVENT".equals(strM21103b2)) {
                    c8561f = c8561f;
                    str3 = null;
                    i2 = 2;
                } else {
                    j7 = j7;
                    j7 = j7;
                    str3 = null;
                }
            } else {
                if (str2.startsWith("#EXT-X-START")) {
                    j7 = (long) (Double.parseDouble(m21103b(str2, f19345j)) * 1000000.0d);
                } else {
                    if (str2.startsWith("#EXT-X-MAP")) {
                        String strM21103b3 = m21103b(str2, f19349n);
                        String strM21101a2 = m21101a(str2, f19347l);
                        if (strM21101a2 != null) {
                            String[] strArrSplit = strM21101a2.split("@");
                            j6 = Long.parseLong(strArrSplit[0]);
                            if (strArrSplit.length > 1) {
                                j3 = Long.parseLong(strArrSplit[1]);
                            }
                        }
                        C8558c c8558c2 = new C8558c(strM21103b3, 0L, -1, -9223372036854775807L, false, null, null, j3, j6);
                        c8561f = c8561f;
                        j3 = 0;
                        j6 = -1;
                        c8558c = c8558c2;
                    } else if (str2.startsWith("#EXT-X-TARGETDURATION")) {
                        j = 1000000 * ((long) Integer.parseInt(m21103b(str2, f19340e)));
                    } else if (str2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        i3 = Integer.parseInt(m21103b(str2, f19343h));
                        c8561f = c8561f;
                        i7 = i3;
                    } else if (str2.startsWith("#EXT-X-VERSION")) {
                        i5 = Integer.parseInt(m21103b(str2, f19341f));
                    } else if (str2.startsWith("#EXTINF")) {
                        c8561f = c8561f;
                        j4 = (long) (Double.parseDouble(m21103b(str2, f19344i)) * 1000000.0d);
                    } else if (str2.startsWith("#EXT-X-KEY")) {
                        zEquals = "AES-128".equals(m21103b(str2, f19348m));
                        if (zEquals) {
                            strM21103b = m21103b(str2, f19349n);
                            strM21101a = m21101a(str2, f19350o);
                        } else {
                            c8561f = c8561f;
                            str3 = null;
                            strM21103b = null;
                            strM21101a = null;
                        }
                    } else if (str2.startsWith("#EXT-X-BYTERANGE")) {
                        String[] strArrSplit2 = m21103b(str2, f19346k).split("@");
                        j6 = Long.parseLong(strArrSplit2[0]);
                        if (strArrSplit2.length > 1) {
                            j3 = Long.parseLong(strArrSplit2[1]);
                        }
                    } else if (str2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                        i6 = Integer.parseInt(str2.substring(str2.indexOf(58) + 1));
                        z = true;
                    } else if (str2.equals("#EXT-X-DISCONTINUITY")) {
                        i4++;
                    } else {
                        if (!str2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                            j7 = j7;
                            if (str2.startsWith("#EXT-X-DATERANGE")) {
                                arrayList2.add(str2);
                            } else if (str2.startsWith("#")) {
                                if (str2.equals("#EXT-X-ENDLIST")) {
                                    z2 = true;
                                }
                                j7 = j7;
                            } else {
                                if (zEquals) {
                                    hexString = strM21101a != null ? strM21101a : Integer.toHexString(i3);
                                } else {
                                    hexString = null;
                                }
                                int i8 = i3 + 1;
                                long j8 = j6 == -1 ? 0L : j3;
                                arrayList.add(new C8558c(str2, j4, i4, j5, zEquals, strM21103b, hexString, j8, j6));
                                j5 += j4;
                                if (j6 != -1) {
                                    j8 += j6;
                                }
                                j3 = j8;
                                i3 = i8;
                                j4 = 0;
                                j6 = -1;
                                j7 = j7;
                                str3 = null;
                                c8561f = c8561f;
                            }
                        } else if (j2 == 0) {
                            String strSubstring = str2.substring(str2.indexOf(58) + 1);
                            Matcher matcher = AbstractC8827z.f20676f.matcher(strSubstring);
                            if (!matcher.matches()) {
                                throw new C8711r("Invalid date/time format: " + strSubstring);
                            }
                            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                i = 0;
                            } else {
                                i = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                                if (matcher.group(11).equals("-")) {
                                    i *= -1;
                                }
                            }
                            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                            gregorianCalendar.clear();
                            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                            if (!TextUtils.isEmpty(matcher.group(8))) {
                                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                            }
                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                            if (i != 0) {
                                timeInMillis -= (long) (i * 60000);
                            }
                            int i9 = AbstractC8515b.f19086a;
                            j2 = (timeInMillis == -9223372036854775807L ? -9223372036854775807L : timeInMillis * 1000) - j5;
                        } else {
                            j7 = j7;
                        }
                        j7 = j7;
                    }
                    str3 = null;
                }
                c8561f = c8561f;
                str3 = null;
            }
        }
        return new C8559d(i2, str, j7, j2, z, i6, i7, i5, j, z2, j2 != 0, c8558c, arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: b */
    public static String m21103b(String str, Pattern pattern) throws C8711r {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new C8711r("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:34:0x006b, B:35:0x0072, B:12:0x002e, B:14:0x0034, B:18:0x003d, B:20:0x0045, B:23:0x0052, B:25:0x0058, B:29:0x005f, B:30:0x0064, B:36:0x0073, B:38:0x0079, B:41:0x0084, B:43:0x008c, B:44:0x009d, B:46:0x00a5, B:48:0x00ad, B:50:0x00b5, B:52:0x00bd, B:54:0x00c5, B:56:0x00cd, B:58:0x00d5, B:61:0x00de, B:62:0x00e2), top: B:70:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0045 A[Catch: all -> 0x0101, LOOP:1: B:16:0x003a->B:20:0x0045, LOOP_END, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:34:0x006b, B:35:0x0072, B:12:0x002e, B:14:0x0034, B:18:0x003d, B:20:0x0045, B:23:0x0052, B:25:0x0058, B:29:0x005f, B:30:0x0064, B:36:0x0073, B:38:0x0079, B:41:0x0084, B:43:0x008c, B:44:0x009d, B:46:0x00a5, B:48:0x00ad, B:50:0x00b5, B:52:0x00bd, B:54:0x00c5, B:56:0x00cd, B:58:0x00d5, B:61:0x00de, B:62:0x00e2), top: B:70:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:75:0x006b A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:22:0x0050
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: a */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.AbstractC8560e m21104a(android.net.Uri r7, com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8785j r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C8562g.m21104a(android.net.Uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e");
    }
}
