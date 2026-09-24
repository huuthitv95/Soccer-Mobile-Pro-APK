package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.p300io.encoding.Base64;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3h */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C45183h {
    public static byte[] A0R;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public HashMap<C7435pg, C7433pe> A0G;
    public HashSet<Integer> A0H;
    public List<String> A0I;
    public List<String> A0J;
    public List<String> A0K;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public List<String> A0L;
    public List<String> A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    static {
        A0P();
    }

    public static String A0H(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0R, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A0R = new byte[]{63, Base64.padSymbol, 44, 40, 53, 51, 50, 53, 50, 59};
    }

    @Deprecated
    public C45183h() {
        this.A06 = Integer.MAX_VALUE;
        this.A05 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0Q = true;
        this.A0M = MetaExoPlayerCustomizedCollections.A01();
        this.A0D = 0;
        this.A0L = MetaExoPlayerCustomizedCollections.A01();
        this.A0I = MetaExoPlayerCustomizedCollections.A01();
        this.A0B = 0;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0J = MetaExoPlayerCustomizedCollections.A01();
        this.A0K = MetaExoPlayerCustomizedCollections.A01();
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = new HashMap<>();
        this.A0H = new HashSet<>();
    }

    public C45183h(Context context) {
        this();
        A0n(context);
        A0o(context, true);
    }

    public C45183h(Bundle bundle) {
        List listA01;
        this.A06 = bundle.getInt(C7431pc.A0e, C7431pc.A0U.A06);
        this.A05 = bundle.getInt(C7431pc.A0d, C7431pc.A0U.A05);
        this.A04 = bundle.getInt(C7431pc.A0c, C7431pc.A0U.A04);
        this.A03 = bundle.getInt(C7431pc.A0b, C7431pc.A0U.A03);
        this.A0A = bundle.getInt(C7431pc.A0i, C7431pc.A0U.A0A);
        this.A09 = bundle.getInt(C7431pc.A0h, C7431pc.A0U.A09);
        this.A08 = bundle.getInt(C7431pc.A0n(), C7431pc.A0U.A08);
        this.A07 = bundle.getInt(C7431pc.A0f, C7431pc.A0U.A07);
        this.A0F = bundle.getInt(C7431pc.A0v, C7431pc.A0U.A0F);
        this.A0E = bundle.getInt(C7431pc.A0t, C7431pc.A0U.A0E);
        this.A0Q = bundle.getBoolean(C7431pc.A0u, C7431pc.A0U.A0Q);
        this.A0M = AbstractC4978BP.A07((String[]) AbstractC7135ka.A00(bundle.getStringArray(C7431pc.A0p), new String[0]));
        this.A0D = bundle.getInt(C7431pc.A0q, C7431pc.A0U.A0D);
        String[] preferredVideoLanguages1 = (String[]) AbstractC7135ka.A00(bundle.getStringArray(C7431pc.A0o), new String[0]);
        this.A0L = A0G(preferredVideoLanguages1);
        String[] preferredVideoLanguages2 = new String[0];
        this.A0I = A0G((String[]) AbstractC7135ka.A00(bundle.getStringArray(C7431pc.A0j), preferredVideoLanguages2));
        this.A0B = bundle.getInt(C7431pc.A0l, C7431pc.A0U.A0B);
        this.A02 = bundle.getInt(C7431pc.A0a, C7431pc.A0U.A02);
        this.A01 = bundle.getInt(C7431pc.A0Z, C7431pc.A0U.A01);
        String[] preferredVideoLanguages3 = new String[0];
        this.A0J = AbstractC4978BP.A07((String[]) AbstractC7135ka.A00(bundle.getStringArray(C7431pc.A0k), preferredVideoLanguages3));
        String[] preferredVideoLanguages4 = new String[0];
        this.A0K = A0G((String[]) AbstractC7135ka.A00(bundle.getStringArray(C7431pc.A0m), preferredVideoLanguages4));
        this.A0C = bundle.getInt(C7431pc.A0n, C7431pc.A0U.A0C);
        this.A00 = bundle.getInt(C7431pc.A0e(), C7431pc.A0U.A00);
        this.A0P = bundle.getBoolean(C7431pc.A0s, C7431pc.A0U.A0P);
        this.A0O = bundle.getBoolean(C7431pc.A0X, C7431pc.A0U.A0O);
        this.A0N = bundle.getBoolean(C7431pc.A0W, C7431pc.A0U.A0N);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C7431pc.A0r);
        if (parcelableArrayList == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = C454144.A01(C7433pe.A02, parcelableArrayList);
        }
        this.A0G = new HashMap<>();
        for (int i = 0; i < listA01.size(); i++) {
            C7433pe c7433pe = (C7433pe) listA01.get(i);
            this.A0G.put(c7433pe.A00, c7433pe);
        }
        int[] iArr = (int[]) AbstractC7135ka.A00(bundle.getIntArray(C7431pc.A0V), new int[0]);
        this.A0H = new HashSet<>();
        for (int i2 : iArr) {
            this.A0H.add(Integer.valueOf(i2));
        }
    }

    public C45183h(C7431pc c7431pc) {
        A0R(c7431pc);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    public static AbstractC4978BP<String> A0G(String[] strArr) {
        C44382K c44382kA01 = AbstractC4978BP.A01();
        for (String str : (String[]) AbstractC45353y.A01(strArr)) {
            c44382kA01.A04(AbstractC46115C.A0k((String) AbstractC45353y.A01(str)));
        }
        return c44382kA01.A05();
    }

    private void A0Q(Context context) {
        CaptioningManager captioningManager;
        if ((AbstractC46115C.A02 < 23 && Looper.myLooper() == null) || (captioningManager = (CaptioningManager) context.getSystemService(A0H(0, 10, 126))) == null || !captioningManager.isEnabled()) {
            return;
        }
        this.A0C = 1088;
        Locale locale = captioningManager.getLocale();
        if (locale != null) {
            this.A0K = AbstractC4978BP.A04(AbstractC46115C.A0o(locale));
        }
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    private void A0R(C7431pc c7431pc) {
        this.A06 = c7431pc.A06;
        this.A05 = c7431pc.A05;
        this.A04 = c7431pc.A04;
        this.A03 = c7431pc.A03;
        this.A0A = c7431pc.A0A;
        this.A09 = c7431pc.A09;
        this.A08 = c7431pc.A08;
        this.A07 = c7431pc.A07;
        this.A0F = c7431pc.A0F;
        this.A0E = c7431pc.A0E;
        this.A0Q = c7431pc.A0Q;
        this.A0M = c7431pc.A0M;
        this.A0D = c7431pc.A0D;
        this.A0L = c7431pc.A0L;
        this.A0I = c7431pc.A0I;
        this.A0B = c7431pc.A0B;
        this.A02 = c7431pc.A02;
        this.A01 = c7431pc.A01;
        this.A0J = c7431pc.A0J;
        this.A0K = c7431pc.A0K;
        this.A0C = c7431pc.A0C;
        this.A00 = c7431pc.A00;
        this.A0P = c7431pc.A0P;
        this.A0O = c7431pc.A0O;
        this.A0N = c7431pc.A0N;
        this.A0H = new HashSet<>(c7431pc.A0H);
        this.A0G = new HashMap<>(c7431pc.A0G);
    }

    public C45183h A0W(C7431pc c7431pc) {
        A0R(c7431pc);
        return this;
    }

    public C45183h A0m(int i, int i2, boolean z) {
        this.A0F = i;
        this.A0E = i2;
        this.A0Q = z;
        return this;
    }

    public C45183h A0n(Context context) {
        if (AbstractC46115C.A02 >= 19) {
            A0Q(context);
        }
        return this;
    }

    public C45183h A0o(Context context, boolean z) {
        Point viewportSize = AbstractC46115C.A0W(context);
        return A0m(viewportSize.x, viewportSize.y, z);
    }

    public C7431pc A0p() {
        return new C7431pc(this);
    }
}
