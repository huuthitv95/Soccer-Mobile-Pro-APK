package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8A */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47958A {
    public static String[] A06 = {"jkVScMAnmSDw5NjtFKaMDw93YHVTZfVV", "X8vR6FaiUrrVUV4OyPqbjTz4nTbdT", "DJqg7VUdCo9q2ysxPrWS1RTdTLsj", "4FrbkvGGO58oIWN02YSUZA4iQkwc41Il", "lEgbsVLzgPUjgc1", "ISDPu1y88m9uUW9z", "L6djBwtYOA2bka2PQ69EdZLSIG4ne", "x8MPEelqUvAzBLNZGFUUNdgpeh0HUacA"};
    public C7320no A00;
    public C7320no A01;
    public C7320no A02;
    public AbstractC4978BP<C7320no> A03 = AbstractC4978BP.A03();
    public AbstractC7364oX<C7320no, Timeline> A04 = AbstractC7364oX.A04();
    public final C7439pl A05;

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C7320no A00(InterfaceC45133b interfaceC45133b, AbstractC4978BP<C7320no> abstractC4978BP, C7320no c7320no, C7439pl c7439pl) {
        int iA07;
        Object obj;
        int i;
        Timeline timelineA7g = interfaceC45133b.A7g();
        int iA7c = interfaceC45133b.A7c();
        Object objA0M = timelineA7g.A0N() ? null : timelineA7g.A0M(iA7c);
        if (interfaceC45133b.AAd()) {
            iA07 = -1;
        } else {
            boolean zA0N = timelineA7g.A0N();
            String[] strArr = A06;
            if (strArr[7].charAt(14) != strArr[3].charAt(14)) {
                throw new RuntimeException();
            }
            A06[6] = "fPIpfte6042F2VeKOBsTFTkNJVxhR";
            if (zA0N) {
                iA07 = -1;
            } else {
                iA07 = timelineA7g.A0H(iA7c, c7439pl).A07(AbstractC46115C.A0O(interfaceC45133b.A7e()) - c7439pl.A0C());
            }
        }
        for (int i2 = 0; i2 < abstractC4978BP.size(); i2++) {
            C7320no c7320no2 = abstractC4978BP.get(i2);
            if (A04(c7320no2, objA0M, interfaceC45133b.AAd(), interfaceC45133b.A7Y(), interfaceC45133b.A7Z(), iA07)) {
                return c7320no2;
            }
        }
        if (abstractC4978BP.isEmpty() && c7320no != null && A04(c7320no, obj, interfaceC45133b.AAd(), interfaceC45133b.A7Y(), interfaceC45133b.A7Z(), i)) {
            obj = objA0M;
            i = iA07;
            return c7320no;
        }
        obj = objA0M;
        i = iA07;
        return null;
    }

    public C47958A(C7439pl c7439pl) {
        this.A05 = c7439pl;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "builder of ImmutableMap should be a buildOrThrow")
    private void A02(Timeline timeline) {
        C7362oV<C7320no, Timeline> c7362oVA03 = AbstractC7364oX.A03();
        if (this.A03.isEmpty()) {
            A03(c7362oVA03, this.A01, timeline);
            C7320no c7320no = this.A02;
            C7320no c7320no2 = this.A01;
            if (A06[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[2] = "UxUdIKnoAyUMpq9t4QIr4fpxRPT3";
            strArr[1] = "6BCX8szW2uTmGViuSf00Yq1AObOIr";
            if (!AbstractC5025CB.A01(c7320no, c7320no2)) {
                A03(c7362oVA03, this.A02, timeline);
            }
            if (!AbstractC5025CB.A01(this.A00, this.A01) && !AbstractC5025CB.A01(this.A00, this.A02)) {
                A03(c7362oVA03, this.A00, timeline);
            }
        } else {
            for (int i = 0; i < this.A03.size(); i++) {
                A03(c7362oVA03, this.A03.get(i), timeline);
            }
            if (!this.A03.contains(this.A00)) {
                A03(c7362oVA03, this.A00, timeline);
            }
        }
        this.A04 = c7362oVA03.A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    private void A03(C7362oV<C7320no, Timeline> c7362oV, C7320no c7320no, Timeline timeline) {
        if (c7320no == null) {
            return;
        }
        if (timeline.A0A(c7320no.A04) != -1) {
            c7362oV.A05(c7320no, timeline);
            return;
        }
        Timeline existingTimeline = this.A04.get(c7320no);
        if (existingTimeline == null) {
            return;
        }
        c7362oV.A05(c7320no, existingTimeline);
    }

    public static boolean A04(C7320no c7320no, Object obj, boolean z, int i, int i2, int i3) {
        if (c7320no.A04.equals(obj)) {
            return (z && c7320no.A00 == i && c7320no.A01 == i2) || (!z && c7320no.A00 == -1 && c7320no.A02 == i3);
        }
        return false;
    }

    public final Timeline A05(C7320no c7320no) {
        return this.A04.get(c7320no);
    }

    public final C7320no A06() {
        return this.A00;
    }

    public final void A07(InterfaceC45133b interfaceC45133b) {
        this.A00 = A00(interfaceC45133b, this.A03, this.A01, this.A05);
        A02(interfaceC45133b.A7g());
    }
}
