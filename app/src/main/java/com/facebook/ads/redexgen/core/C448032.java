package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.MediaItem;
import com.facebook.ads.androidx.media3.common.StreamKey;
import com.google.common.base.Ascii;
import com.ironsource.C11341A5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.32 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C448032 {
    public static byte[] A09;
    public static String[] A0A = {"x4YClL2ZysfVPCFZjhpW4oP0jWiK4Q3l", "qTcDzMP2wLEx15nCuEUhgp4TY7vV", "SIpQOLlqDgpshhwjhc8D2jgDkVzbvCX7", "J0RaUpvVzbbvSqSgIYK8O25JdvitlZZ4", "cm5jE18fh6qtcHu4S6QHstxeiM", C11341A5.f23826q, "LQDJUPwAzqbXUo9Li69tSY6YDGIQDwU", "wUCT9e8FTOqtQKr8s0xzb6XHsL6fqF1p"};
    public final Uri A00;
    public final C44712t A01;
    public final C44762y A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final List<StreamKey> A06;
    public final List<MediaItem.SubtitleConfiguration> A07;

    @Deprecated
    public final List<MediaItem.Subtitle> A08;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{Ascii.f22500SO, Ascii.f22491EM, 5, 0, 8, 57, Ascii.f22493FS, 3, 2, 113, 120, 106, 113, 90, 118, 125, 124};
    }

    static {
        A01();
    }

    public C448032(Uri uri, String str, C44762y c44762y, C44712t c44712t, List<StreamKey> streamKeys, String str2, List<MediaItem.SubtitleConfiguration> subtitleConfigurations, Object obj) {
        this.A00 = uri;
        this.A05 = str;
        this.A02 = c44762y;
        this.A01 = c44712t;
        this.A06 = streamKeys;
        this.A04 = str2;
        this.A07 = subtitleConfigurations;
        LinkedList linkedList = new LinkedList();
        if (0 < subtitleConfigurations.size()) {
            subtitleConfigurations.get(0);
            throw new NullPointerException(A00(0, 9, 35));
        }
        List<MediaItem.Subtitle> subtitles = new ArrayList<>(linkedList);
        this.A08 = subtitles;
        this.A03 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C448032)) {
            return false;
        }
        C448032 c448032 = (C448032) obj;
        if (this.A00.equals(c448032.A00) && AbstractC46115C.A1E(this.A05, c448032.A05) && AbstractC46115C.A1E(this.A02, c448032.A02)) {
            if (A0A[7].charAt(13) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[3] = "SNoZAEbl0aNlH2coBrY7ADFEuEiuIdsk";
            strArr[0] = "hNPU4lA8QZuNoOME96TtOhTBwniZIKf2";
            if (AbstractC46115C.A1E(null, null) && this.A06.equals(c448032.A06) && AbstractC46115C.A1E(this.A04, c448032.A04) && this.A07.equals(c448032.A07) && AbstractC46115C.A1E(this.A03, c448032.A03)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00.hashCode();
        int i = result * 31;
        int result2 = this.A05 == null ? 0 : this.A05.hashCode();
        int result3 = (((i + result2) * 31) + (this.A02 == null ? 0 : this.A02.hashCode())) * 31;
        if (0 == 0) {
            int result4 = (((result3 + 0) * 31) + this.A06.hashCode()) * 31;
            int result5 = this.A04 == null ? 0 : this.A04.hashCode();
            return ((((result4 + result5) * 31) + this.A07.hashCode()) * 31) + (this.A03 != null ? this.A03.hashCode() : 0);
        }
        throw new NullPointerException(A00(9, 8, 86));
    }
}
