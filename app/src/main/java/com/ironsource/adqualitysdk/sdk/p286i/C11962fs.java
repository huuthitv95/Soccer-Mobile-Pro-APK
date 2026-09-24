package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fs */
/* JADX INFO: loaded from: classes6.dex */
public final class C11962fs extends AbstractC11961fr {

    /* JADX INFO: renamed from: ﭖ */
    private static int f28915 = 1;

    /* JADX INFO: renamed from: ﮐ */
    private static int f28916 = 2;

    /* JADX INFO: renamed from: ﱟ */
    private static short[] f28917 = null;

    /* JADX INFO: renamed from: ﱡ */
    private static int f28918 = 0;

    /* JADX INFO: renamed from: ﺙ */
    private static byte[] f28919 = {-64, Ascii.f22498RS, -69, -63, -30, -8, 0, 0, 0};

    /* JADX INFO: renamed from: ﻏ */
    private static int f28920 = -1499822793;

    /* JADX INFO: renamed from: ﻐ */
    private static int f28921 = 725581750;

    /* JADX INFO: renamed from: ﻛ */
    private AbstractC11961fr f28922;

    /* JADX INFO: renamed from: ｋ */
    private AbstractC11919ec f28923;

    /* JADX INFO: renamed from: ﾇ */
    private AbstractC11919ec f28924;

    /* JADX INFO: renamed from: ﾒ */
    private AbstractC11919ec f28925;

    public C11962fs(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, AbstractC11919ec abstractC11919ec3, AbstractC11961fr abstractC11961fr) {
        this.f28925 = abstractC11919ec;
        this.f28924 = abstractC11919ec2;
        this.f28923 = abstractC11919ec3;
        this.f28922 = abstractC11961fr;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11961fr
    /* JADX INFO: renamed from: ｋ */
    public final C11908ds mo30195(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28918 + 65;
        f28915 = i2 % 128;
        int i3 = i2 % 2;
        m30206(this.f28925, c11907dr, c11877co);
        while (this.f28924.m30156(c11907dr, c11877co).m30065()) {
            C11908ds c11908dsMo30195 = this.f28922.mo30195(c11907dr, c11877co);
            if (c11908dsMo30195.m30062()) {
                break;
            }
            if (c11908dsMo30195.m30064()) {
                return c11908dsMo30195;
            }
            m30206(this.f28923, c11907dr, c11877co);
            int i4 = f28915 + 63;
            f28918 = i4 % 128;
            int i5 = i4 % 2;
        }
        return new C11908ds(null);
    }

    /* JADX INFO: renamed from: ﾇ */
    private static C11908ds m30206(AbstractC11919ec abstractC11919ec, C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28918 + 113;
        f28915 = i2 % 128;
        int i3 = i2 % 2;
        if (abstractC11919ec != null) {
            return abstractC11919ec.m30156(c11907dr, c11877co);
        }
        C11908ds c11908ds = new C11908ds(null);
        int i4 = f28915 + 15;
        f28918 = i4 % 128;
        int i5 = i4 % 2;
        return c11908ds;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m30207((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 725581750, (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 84), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1499822895, (byte) (100 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 3 - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
        AbstractC11919ec abstractC11919ec = this.f28925;
        if (abstractC11919ec != null) {
            sb.append(abstractC11919ec);
            int i2 = f28915 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f28918 = i2 % 128;
            int i3 = i2 % 2;
        }
        sb.append(m30207((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 725581746, (short) ((-119) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 1499822853, (byte) ((-113) - (ViewConfiguration.getTapTimeout() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
        sb.append(this.f28924);
        sb.append(m30207((-725581745) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) ((-119) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1499822852 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ((-113) - View.MeasureSpec.getSize(0)), (-1) - ExpandableListView.getPackedPositionChild(0L)).intern());
        AbstractC11919ec abstractC11919ec2 = this.f28923;
        if (abstractC11919ec2 != null) {
            int i4 = f28918 + 63;
            f28915 = i4 % 128;
            int i5 = i4 % 2;
            sb.append(abstractC11919ec2);
        }
        sb.append(m30207((-725581745) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) (View.MeasureSpec.getMode(0) + 21), 1499822834 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) ((-6) - Color.red(0)), ExpandableListView.getPackedPositionGroup(0L)).intern());
        sb.append(this.f28922);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    public final boolean equals(Object obj) {
        C11962fs c11962fs;
        AbstractC11919ec abstractC11919ec;
        AbstractC11919ec abstractC11919ec2;
        AbstractC11919ec abstractC11919ec3;
        AbstractC11961fr abstractC11961fr;
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f28918 + 87;
            f28915 = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (obj != null) {
            int i5 = f28918 + 109;
            f28915 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 72 / 0;
                if (getClass() == obj.getClass()) {
                    c11962fs = (C11962fs) obj;
                    abstractC11919ec = this.f28925;
                    if (abstractC11919ec != null ? c11962fs.f28925 == null : abstractC11919ec.equals(c11962fs.f28925)) {
                        abstractC11919ec2 = this.f28924;
                        if (abstractC11919ec2 != null ? c11962fs.f28924 != null : !abstractC11919ec2.equals(c11962fs.f28924)) {
                            return false;
                        }
                        abstractC11919ec3 = this.f28923;
                        if (abstractC11919ec3 != null ? c11962fs.f28923 != null : !abstractC11919ec3.equals(c11962fs.f28923)) {
                            return false;
                        }
                        abstractC11961fr = this.f28922;
                        if (abstractC11961fr != null) {
                            int i7 = f28915 + 29;
                            f28918 = i7 % 128;
                            int i8 = i7 % 2;
                            return abstractC11961fr.equals(c11962fs.f28922);
                        }
                        if (c11962fs.f28922 == null) {
                            int i9 = f28918;
                            int i10 = i9 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                            f28915 = i10 % 128;
                            int i11 = i10 % 2;
                            i = i9 + 35;
                            f28915 = i % 128;
                            if (i % 2 == 0) {
                                int i12 = 46 / 0;
                            }
                            return true;
                        }
                    } else {
                        int i13 = f28918 + 115;
                        f28915 = i13 % 128;
                        if (i13 % 2 != 0) {
                            return false;
                        }
                        Object obj2 = null;
                        super.hashCode();
                        throw null;
                    }
                }
            } else if (getClass() == obj.getClass()) {
                c11962fs = (C11962fs) obj;
                abstractC11919ec = this.f28925;
                if (abstractC11919ec != null) {
                    abstractC11919ec2 = this.f28924;
                    if (abstractC11919ec2 != null) {
                        abstractC11919ec3 = this.f28923;
                        if (abstractC11919ec3 != null) {
                            abstractC11961fr = this.f28922;
                            if (abstractC11961fr != null) {
                                int i14 = f28915 + 29;
                                f28918 = i14 % 128;
                                int i15 = i14 % 2;
                                return abstractC11961fr.equals(c11962fs.f28922);
                            }
                            if (c11962fs.f28922 == null) {
                                int i16 = f28918;
                                int i17 = i16 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                                f28915 = i17 % 128;
                                int i18 = i17 % 2;
                                i = i16 + 35;
                                f28915 = i % 128;
                                if (i % 2 == 0) {
                                    int i19 = 46 / 0;
                                }
                                return true;
                            }
                        } else {
                            abstractC11961fr = this.f28922;
                            if (abstractC11961fr != null) {
                                int i110 = f28915 + 29;
                                f28918 = i110 % 128;
                                int i111 = i110 % 2;
                                return abstractC11961fr.equals(c11962fs.f28922);
                            }
                            if (c11962fs.f28922 == null) {
                                int i112 = f28918;
                                int i113 = i112 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                                f28915 = i113 % 128;
                                int i114 = i113 % 2;
                                i = i112 + 35;
                                f28915 = i % 128;
                                if (i % 2 == 0) {
                                    int i115 = 46 / 0;
                                }
                                return true;
                            }
                        }
                    } else {
                        abstractC11919ec3 = this.f28923;
                        if (abstractC11919ec3 != null) {
                            abstractC11961fr = this.f28922;
                            if (abstractC11961fr != null) {
                                int i116 = f28915 + 29;
                                f28918 = i116 % 128;
                                int i117 = i116 % 2;
                                return abstractC11961fr.equals(c11962fs.f28922);
                            }
                            if (c11962fs.f28922 == null) {
                                int i118 = f28918;
                                int i119 = i118 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                                f28915 = i119 % 128;
                                int i1110 = i119 % 2;
                                i = i118 + 35;
                                f28915 = i % 128;
                                if (i % 2 == 0) {
                                    int i1111 = 46 / 0;
                                }
                                return true;
                            }
                        } else {
                            abstractC11961fr = this.f28922;
                            if (abstractC11961fr != null) {
                                int i1112 = f28915 + 29;
                                f28918 = i1112 % 128;
                                int i1113 = i1112 % 2;
                                return abstractC11961fr.equals(c11962fs.f28922);
                            }
                            if (c11962fs.f28922 == null) {
                                int i1114 = f28918;
                                int i1115 = i1114 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                                f28915 = i1115 % 128;
                                int i1116 = i1115 % 2;
                                i = i1114 + 35;
                                f28915 = i % 128;
                                if (i % 2 == 0) {
                                    int i1117 = 46 / 0;
                                }
                                return true;
                            }
                        }
                    }
                } else {
                    abstractC11919ec2 = this.f28924;
                    if (abstractC11919ec2 != null) {
                        abstractC11919ec3 = this.f28923;
                        if (abstractC11919ec3 != null) {
                            abstractC11961fr = this.f28922;
                            if (abstractC11961fr != null) {
                                int i1118 = f28915 + 29;
                                f28918 = i1118 % 128;
                                int i1119 = i1118 % 2;
                                return abstractC11961fr.equals(c11962fs.f28922);
                            }
                            if (c11962fs.f28922 == null) {
                                int i11110 = f28918;
                                int i11111 = i11110 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                                f28915 = i11111 % 128;
                                int i11112 = i11111 % 2;
                                i = i11110 + 35;
                                f28915 = i % 128;
                                if (i % 2 == 0) {
                                    int i11113 = 46 / 0;
                                }
                                return true;
                            }
                        } else {
                            abstractC11961fr = this.f28922;
                            if (abstractC11961fr != null) {
                                int i11114 = f28915 + 29;
                                f28918 = i11114 % 128;
                                int i11115 = i11114 % 2;
                                return abstractC11961fr.equals(c11962fs.f28922);
                            }
                            if (c11962fs.f28922 == null) {
                                int i11116 = f28918;
                                int i11117 = i11116 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                                f28915 = i11117 % 128;
                                int i11118 = i11117 % 2;
                                i = i11116 + 35;
                                f28915 = i % 128;
                                if (i % 2 == 0) {
                                    int i11119 = 46 / 0;
                                }
                                return true;
                            }
                        }
                    } else {
                        abstractC11919ec3 = this.f28923;
                        if (abstractC11919ec3 != null) {
                            abstractC11961fr = this.f28922;
                            if (abstractC11961fr != null) {
                                int i111110 = f28915 + 29;
                                f28918 = i111110 % 128;
                                int i111111 = i111110 % 2;
                                return abstractC11961fr.equals(c11962fs.f28922);
                            }
                            if (c11962fs.f28922 == null) {
                                int i111112 = f28918;
                                int i111113 = i111112 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                                f28915 = i111113 % 128;
                                int i111114 = i111113 % 2;
                                i = i111112 + 35;
                                f28915 = i % 128;
                                if (i % 2 == 0) {
                                    int i111115 = 46 / 0;
                                }
                                return true;
                            }
                        } else {
                            abstractC11961fr = this.f28922;
                            if (abstractC11961fr != null) {
                                int i111116 = f28915 + 29;
                                f28918 = i111116 % 128;
                                int i111117 = i111116 % 2;
                                return abstractC11961fr.equals(c11962fs.f28922);
                            }
                            if (c11962fs.f28922 == null) {
                                int i111118 = f28918;
                                int i111119 = i111118 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                                f28915 = i111119 % 128;
                                int i1111110 = i111119 % 2;
                                i = i111118 + 35;
                                f28915 = i % 128;
                                if (i % 2 == 0) {
                                    int i1111111 = 46 / 0;
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = f28915;
        int i3 = i2 + 101;
        f28918 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        AbstractC11919ec abstractC11919ec = this.f28925;
        if (abstractC11919ec != null) {
            int i4 = i2 + 85;
            f28918 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = abstractC11919ec.hashCode();
        } else {
            iHashCode = 0;
        }
        int i6 = iHashCode * 31;
        AbstractC11919ec abstractC11919ec2 = this.f28924;
        if (abstractC11919ec2 != null) {
            int i7 = f28915 + 23;
            f28918 = i7 % 128;
            if (i7 % 2 != 0) {
                abstractC11919ec2.hashCode();
                throw null;
            }
            iHashCode2 = abstractC11919ec2.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i8 = (i6 + iHashCode2) * 31;
        AbstractC11919ec abstractC11919ec3 = this.f28923;
        int iHashCode3 = (i8 + (abstractC11919ec3 != null ? abstractC11919ec3.hashCode() : 0)) * 31;
        AbstractC11961fr abstractC11961fr = this.f28922;
        return iHashCode3 + (abstractC11961fr != null ? abstractC11961fr.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30207(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f28916;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f28919;
                if (bArr != null) {
                    i5 = (byte) (bArr[f28921 + i] + i4);
                } else {
                    i5 = (short) (f28917[f28921 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f28921 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f28920);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f28919;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f28917;
                        int i8 = C12086m.f29836;
                        C12086m.f29836 = i8 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i8] + s)) ^ C12086m.f29833));
                    }
                    sb.append(C12086m.f29837);
                    C12086m.f29834 = C12086m.f29837;
                    C12086m.f29835++;
                }
            }
            string = sb.toString();
        }
        return string;
    }
}
