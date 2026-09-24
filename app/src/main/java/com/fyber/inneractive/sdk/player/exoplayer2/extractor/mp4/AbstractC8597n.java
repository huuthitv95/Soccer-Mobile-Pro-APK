package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import androidx.core.view.ViewCompat;
import androidx.media3.common.MimeTypes;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8673m;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.AbstractC8700o;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C8687b;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C8695j;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C8704s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C11767Y9;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8597n {

    /* JADX INFO: renamed from: a */
    public static final int f19695a = AbstractC8827z.m21379a("nam");

    /* JADX INFO: renamed from: b */
    public static final int f19696b = AbstractC8827z.m21379a("trk");

    /* JADX INFO: renamed from: c */
    public static final int f19697c = AbstractC8827z.m21379a("cmt");

    /* JADX INFO: renamed from: d */
    public static final int f19698d = AbstractC8827z.m21379a("day");

    /* JADX INFO: renamed from: e */
    public static final int f19699e = AbstractC8827z.m21379a("ART");

    /* JADX INFO: renamed from: f */
    public static final int f19700f = AbstractC8827z.m21379a("too");

    /* JADX INFO: renamed from: g */
    public static final int f19701g = AbstractC8827z.m21379a("alb");

    /* JADX INFO: renamed from: h */
    public static final int f19702h = AbstractC8827z.m21379a("com");

    /* JADX INFO: renamed from: i */
    public static final int f19703i = AbstractC8827z.m21379a("wrt");

    /* JADX INFO: renamed from: j */
    public static final int f19704j = AbstractC8827z.m21379a("lyr");

    /* JADX INFO: renamed from: k */
    public static final int f19705k = AbstractC8827z.m21379a(C11767Y9.f26622n);

    /* JADX INFO: renamed from: l */
    public static final int f19706l = AbstractC8827z.m21379a("covr");

    /* JADX INFO: renamed from: m */
    public static final int f19707m = AbstractC8827z.m21379a("gnre");

    /* JADX INFO: renamed from: n */
    public static final int f19708n = AbstractC8827z.m21379a("grp");

    /* JADX INFO: renamed from: o */
    public static final int f19709o = AbstractC8827z.m21379a("disk");

    /* JADX INFO: renamed from: p */
    public static final int f19710p = AbstractC8827z.m21379a("trkn");

    /* JADX INFO: renamed from: q */
    public static final int f19711q = AbstractC8827z.m21379a("tmpo");

    /* JADX INFO: renamed from: r */
    public static final int f19712r = AbstractC8827z.m21379a("cpil");

    /* JADX INFO: renamed from: s */
    public static final int f19713s = AbstractC8827z.m21379a("aART");

    /* JADX INFO: renamed from: t */
    public static final int f19714t = AbstractC8827z.m21379a("sonm");

    /* JADX INFO: renamed from: u */
    public static final int f19715u = AbstractC8827z.m21379a("soal");

    /* JADX INFO: renamed from: v */
    public static final int f19716v = AbstractC8827z.m21379a("soar");

    /* JADX INFO: renamed from: w */
    public static final int f19717w = AbstractC8827z.m21379a("soaa");

    /* JADX INFO: renamed from: x */
    public static final int f19718x = AbstractC8827z.m21379a("soco");

    /* JADX INFO: renamed from: y */
    public static final int f19719y = AbstractC8827z.m21379a("rtng");

    /* JADX INFO: renamed from: z */
    public static final int f19720z = AbstractC8827z.m21379a("pgap");

    /* JADX INFO: renamed from: A */
    public static final int f19691A = AbstractC8827z.m21379a("sosn");

    /* JADX INFO: renamed from: B */
    public static final int f19692B = AbstractC8827z.m21379a("tvsh");

    /* JADX INFO: renamed from: C */
    public static final int f19693C = AbstractC8827z.m21379a("----");

    /* JADX INFO: renamed from: D */
    public static final String[] f19694D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* JADX INFO: renamed from: a */
    public static C8687b m21136a(C8815n c8815n) {
        String str;
        int iM21340b = c8815n.m21340b();
        if (c8815n.m21340b() != AbstractC8586c.f19539F0) {
            Log.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM21340b2 = c8815n.m21340b() & ViewCompat.MEASURED_SIZE_MASK;
        if (iM21340b2 == 13) {
            str = "image/jpeg";
        } else {
            str = iM21340b2 == 14 ? MimeTypes.IMAGE_PNG : null;
        }
        if (str == null) {
            Log.w("MetadataUtil", "Unrecognized cover art flags: " + iM21340b2);
            return null;
        }
        c8815n.m21347e(c8815n.f20644b + 4);
        int i = iM21340b - 16;
        byte[] bArr = new byte[i];
        c8815n.m21339a(bArr, 0, i);
        return new C8687b(str, null, 3, bArr);
    }

    /* JADX INFO: renamed from: a */
    public static C8695j m21137a(int i, C8815n c8815n) {
        int iM21340b = c8815n.m21340b();
        if (c8815n.m21340b() == AbstractC8586c.f19539F0) {
            c8815n.m21347e(c8815n.f20644b + 8);
            String strM21338a = c8815n.m21338a(iM21340b - 16);
            return new C8695j("und", strM21338a, strM21338a);
        }
        Log.w("MetadataUtil", "Failed to parse comment attribute: " + AbstractC8586c.m21123a(i));
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC8700o m21138a(int i, String str, C8815n c8815n, boolean z, boolean z2) {
        int iMin;
        c8815n.m21347e(c8815n.f20644b + 4);
        if (c8815n.m21340b() == AbstractC8586c.f19539F0) {
            c8815n.m21347e(c8815n.f20644b + 8);
            iMin = c8815n.m21352j();
        } else {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
            iMin = -1;
        }
        if (z2) {
            iMin = Math.min(1, iMin);
        }
        if (iMin >= 0) {
            return z ? new C8704s(str, null, Integer.toString(iMin)) : new C8695j("und", str, Integer.toString(iMin));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC8586c.m21123a(i));
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C8704s m21139a(int i, C8815n c8815n, String str) {
        int iM21340b = c8815n.m21340b();
        if (c8815n.m21340b() == AbstractC8586c.f19539F0 && iM21340b >= 22) {
            c8815n.m21347e(c8815n.f20644b + 10);
            int iM21357o = c8815n.m21357o();
            if (iM21357o > 0) {
                String strM21221a = AbstractC8673m.m21221a("", iM21357o);
                int iM21357o2 = c8815n.m21357o();
                if (iM21357o2 > 0) {
                    strM21221a = strM21221a + RemoteSettings.FORWARD_SLASH_STRING + iM21357o2;
                }
                return new C8704s(str, null, strM21221a);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC8586c.m21123a(i));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C8695j m21140b(int i, C8815n c8815n) {
        String strM21338a = null;
        String strM21338a2 = null;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            int i4 = c8815n.f20644b;
            if (i4 >= i) {
                break;
            }
            int iM21340b = c8815n.m21340b();
            int iM21340b2 = c8815n.m21340b();
            c8815n.m21347e(c8815n.f20644b + 4);
            if (iM21340b2 == AbstractC8586c.f19535D0) {
                strM21338a = c8815n.m21338a(iM21340b - 12);
            } else if (iM21340b2 == AbstractC8586c.f19537E0) {
                strM21338a2 = c8815n.m21338a(iM21340b - 12);
            } else {
                if (iM21340b2 == AbstractC8586c.f19539F0) {
                    i2 = i4;
                    i3 = iM21340b;
                }
                c8815n.m21347e(c8815n.f20644b + (iM21340b - 12));
            }
        }
        if (!"com.apple.iTunes".equals(strM21338a) || !"iTunSMPB".equals(strM21338a2) || i2 == -1) {
            return null;
        }
        c8815n.m21347e(i2);
        c8815n.m21347e(c8815n.f20644b + 16);
        return new C8695j("und", strM21338a2, c8815n.m21338a(i3 - 16));
    }

    /* JADX INFO: renamed from: b */
    public static C8704s m21141b(int i, C8815n c8815n, String str) {
        int iM21340b = c8815n.m21340b();
        if (c8815n.m21340b() == AbstractC8586c.f19539F0) {
            c8815n.m21347e(c8815n.f20644b + 8);
            return new C8704s(str, null, c8815n.m21338a(iM21340b - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + AbstractC8586c.m21123a(i));
        return null;
    }
}
