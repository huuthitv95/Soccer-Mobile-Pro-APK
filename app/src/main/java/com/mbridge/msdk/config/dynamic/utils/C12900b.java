package com.mbridge.msdk.config.dynamic.utils;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.common.base.Ascii;
import com.mbridge.msdk.config.dynamic.C12898c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.utils.b */
/* JADX INFO: compiled from: ComponentLayoutParams.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12900b {

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.utils.b$a */
    /* JADX INFO: compiled from: ComponentLayoutParams.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f34708a;

        static {
            int[] iArr = new int[EnumC12901c.values().length];
            f34708a = iArr;
            try {
                iArr[EnumC12901c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34708a[EnumC12901c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34708a[EnumC12901c.layout_margin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34708a[EnumC12901c.layout_marginLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34708a[EnumC12901c.layout_marginTop.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34708a[EnumC12901c.layout_marginRight.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34708a[EnumC12901c.layout_marginBottom.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34708a[EnumC12901c.layout_marginStart.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34708a[EnumC12901c.layout_marginEnd.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34708a[EnumC12901c.layout_weight.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34708a[EnumC12901c.layout_centerInParent.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34708a[EnumC12901c.layout_centerHorizontal.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34708a[EnumC12901c.layout_centerVertical.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34708a[EnumC12901c.layout_alignParentLeft.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f34708a[EnumC12901c.layout_alignParentTop.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f34708a[EnumC12901c.layout_alignParentRight.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f34708a[EnumC12901c.layout_alignParentBottom.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f34708a[EnumC12901c.layout_alignLeft.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f34708a[EnumC12901c.layout_alignTop.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f34708a[EnumC12901c.layout_alignRight.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f34708a[EnumC12901c.layout_alignBottom.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f34708a[EnumC12901c.layout_above.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f34708a[EnumC12901c.layout_below.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f34708a[EnumC12901c.layout_toLeftOf.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f34708a[EnumC12901c.layout_toRightOf.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f34708a[EnumC12901c.layout_alignBaseline.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f34708a[EnumC12901c.layout_alignWithParentIfMissing.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f34708a[EnumC12901c.layout_alignParentStart.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f34708a[EnumC12901c.layout_alignParentEnd.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f34708a[EnumC12901c.layout_alignStart.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f34708a[EnumC12901c.layout_alignEnd.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f34708a[EnumC12901c.layout_toStartOf.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f34708a[EnumC12901c.layout_toEndOf.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f34708a[EnumC12901c.layout_orientation.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f34708a[EnumC12901c.layout_foregroundGravity.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f34708a[EnumC12901c.layout_row.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f34708a[EnumC12901c.layout_column.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f34708a[EnumC12901c.layout_gravity.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    private static void m36114A(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (obj instanceof Integer) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ((Integer) obj).intValue();
            } else {
                C13219q0.m37816b("ComponentLayoutParams", "handleMarginLeft 无效");
            }
        }
    }

    /* JADX INFO: renamed from: B */
    private static void m36115B(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (obj instanceof Integer) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ((Integer) obj).intValue();
            } else {
                C13219q0.m37816b("ComponentLayoutParams", "handleMarginRight 无效");
            }
        }
    }

    /* JADX INFO: renamed from: C */
    private static void m36116C(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (!(obj instanceof Integer)) {
                C13219q0.m37816b("ComponentLayoutParams", "handleMarginStart 无效");
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(((Integer) obj).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: D */
    private static void m36117D(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (obj instanceof Integer) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((Integer) obj).intValue();
            } else {
                C13219q0.m37816b("ComponentLayoutParams", "handleMarginTop 无效");
            }
        }
    }

    /* JADX INFO: renamed from: E */
    private static void m36118E(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof LinearLayout.LayoutParams)) {
            if (MessengerShareContentUtility.IMAGE_RATIO_HORIZONTAL.equalsIgnoreCase(obj.toString())) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
            } else if ("vertical".equalsIgnoreCase(obj.toString())) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = 1;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    private static void m36119F(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof GridLayout.LayoutParams)) {
            try {
                ((GridLayout.LayoutParams) layoutParams).rowSpec = GridLayout.spec(Integer.parseInt(obj.toString()));
            } catch (NumberFormatException e) {
                C13219q0.m37816b("ComponentLayoutParams", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: G */
    private static void m36120G(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(17, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: H */
    private static void m36121H(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(0, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: I */
    private static void m36122I(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(1, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: J */
    private static void m36123J(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(16, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: K */
    private static void m36124K(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof LinearLayout.LayoutParams)) {
            try {
                ((LinearLayout.LayoutParams) layoutParams).weight = Float.parseFloat(obj.toString());
            } catch (NumberFormatException e) {
                C13219q0.m37816b("ComponentLayoutParams", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: L */
    private static void m36125L(ViewGroup.LayoutParams layoutParams, Object obj) {
        try {
            if (!(obj instanceof String)) {
                if (obj instanceof Integer) {
                    layoutParams.width = ((Integer) obj).intValue();
                    return;
                } else {
                    C13219q0.m37816b("ComponentLayoutParams", "width 无效");
                    return;
                }
            }
            String string = obj.toString();
            if (!string.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !string.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                if (string.startsWith("wrap")) {
                    layoutParams.width = -2;
                    return;
                }
                return;
            }
            layoutParams.width = -1;
        } catch (Exception e) {
            C13219q0.m37816b("ComponentLayoutParams", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static ViewGroup.LayoutParams m36127a(String str, Object obj, ViewGroup.LayoutParams layoutParams) {
        try {
            EnumC12901c enumC12901c = (EnumC12901c) C12898c.m36066a().m36072b().get(str);
            if (enumC12901c == null) {
                return null;
            }
            switch (a.f34708a[enumC12901c.ordinal()]) {
                case 1:
                    m36125L(layoutParams, obj);
                    return layoutParams;
                case 2:
                    m36150w(layoutParams, obj);
                    return layoutParams;
                case 3:
                    m36151x(layoutParams, obj);
                    return layoutParams;
                case 4:
                    m36114A(layoutParams, obj);
                    return layoutParams;
                case 5:
                    m36117D(layoutParams, obj);
                    return layoutParams;
                case 6:
                    m36115B(layoutParams, obj);
                    return layoutParams;
                case 7:
                    m36152y(layoutParams, obj);
                    return layoutParams;
                case 8:
                    m36116C(layoutParams, obj);
                    return layoutParams;
                case 9:
                    m36153z(layoutParams, obj);
                    return layoutParams;
                case 10:
                    m36124K(layoutParams, obj);
                    return layoutParams;
                case 11:
                    m36145r(layoutParams, obj);
                    return layoutParams;
                case 12:
                    m36144q(layoutParams, obj);
                    return layoutParams;
                case 13:
                    m36146s(layoutParams, obj);
                    return layoutParams;
                case 14:
                    m36135h(layoutParams, obj);
                    return layoutParams;
                case 15:
                    m36138k(layoutParams, obj);
                    return layoutParams;
                case 16:
                    m36136i(layoutParams, obj);
                    return layoutParams;
                case 17:
                    m36133f(layoutParams, obj);
                    return layoutParams;
                case 18:
                    m36132e(layoutParams, obj);
                    return layoutParams;
                case 19:
                    m36141n(layoutParams, obj);
                    return layoutParams;
                case 20:
                    m36139l(layoutParams, obj);
                    return layoutParams;
                case 21:
                    m36130c(layoutParams, obj);
                    return layoutParams;
                case 22:
                    m36128a(layoutParams, obj);
                    return layoutParams;
                case 23:
                    m36143p(layoutParams, obj);
                    return layoutParams;
                case 24:
                    m36121H(layoutParams, obj);
                    return layoutParams;
                case 25:
                    m36122I(layoutParams, obj);
                    return layoutParams;
                case 26:
                    m36129b(layoutParams, obj);
                    return layoutParams;
                case 27:
                    m36142o(layoutParams, obj);
                    return layoutParams;
                case 28:
                    m36137j(layoutParams, obj);
                    return layoutParams;
                case 29:
                    m36134g(layoutParams, obj);
                    return layoutParams;
                case 30:
                    m36140m(layoutParams, obj);
                    return layoutParams;
                case 31:
                    m36131d(layoutParams, obj);
                    return layoutParams;
                case 32:
                    m36123J(layoutParams, obj);
                    return layoutParams;
                case 33:
                    m36120G(layoutParams, obj);
                    return layoutParams;
                case 34:
                    m36118E(layoutParams, obj);
                    return layoutParams;
                case 35:
                    m36148u(layoutParams, obj);
                    return layoutParams;
                case 36:
                    m36119F(layoutParams, obj);
                    return layoutParams;
                case 37:
                    m36147t(layoutParams, obj);
                    return layoutParams;
                case 38:
                    m36149v(layoutParams, obj);
                    return layoutParams;
                default:
                    return layoutParams;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m36129b(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(4, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m36130c(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(8, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m36131d(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(19, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m36132e(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(5, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m36133f(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof RelativeLayout.LayoutParams) && Boolean.parseBoolean(obj.toString())) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12);
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m36134g(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(21, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m36135h(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof RelativeLayout.LayoutParams) && Boolean.parseBoolean(obj.toString())) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(9);
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m36136i(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof RelativeLayout.LayoutParams) && Boolean.parseBoolean(obj.toString())) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(11);
        }
    }

    /* JADX INFO: renamed from: j */
    private static void m36137j(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(20, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: k */
    private static void m36138k(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof RelativeLayout.LayoutParams) && Boolean.parseBoolean(obj.toString())) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(10);
        }
    }

    /* JADX INFO: renamed from: l */
    private static void m36139l(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(7, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: m */
    private static void m36140m(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(18, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m36141n(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(6, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: o */
    private static void m36142o(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof String) && Boolean.parseBoolean((String) obj)) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(20);
            layoutParams2.addRule(21);
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m36143p(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(3, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m36144q(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (obj instanceof String) {
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                if (Boolean.parseBoolean(obj.toString())) {
                    ((RelativeLayout.LayoutParams) layoutParams).addRule(14);
                }
            } else if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = 1;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private static void m36145r(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof RelativeLayout.LayoutParams) && Boolean.parseBoolean(obj.toString())) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
    }

    /* JADX INFO: renamed from: s */
    private static void m36146s(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof RelativeLayout.LayoutParams)) {
            if (Boolean.parseBoolean(obj.toString())) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(15);
            }
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        }
    }

    /* JADX INFO: renamed from: t */
    private static void m36147t(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof GridLayout.LayoutParams)) {
            try {
                ((GridLayout.LayoutParams) layoutParams).columnSpec = GridLayout.spec(Integer.parseInt(obj.toString()));
            } catch (NumberFormatException e) {
                C13219q0.m37816b("ComponentLayoutParams", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private static void m36148u(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof FrameLayout.LayoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = m36126a(obj.toString());
        }
    }

    /* JADX INFO: renamed from: v */
    private static void m36149v(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (obj instanceof String) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = C12898c.m36066a().m36073c(obj.toString());
            } else if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = C12898c.m36066a().m36073c(obj.toString());
            }
        }
    }

    /* JADX INFO: renamed from: w */
    private static void m36150w(ViewGroup.LayoutParams layoutParams, Object obj) {
        try {
            if (!(obj instanceof String)) {
                if (obj instanceof Integer) {
                    layoutParams.height = ((Integer) obj).intValue();
                    return;
                } else {
                    C13219q0.m37816b("ComponentLayoutParams", "height 无效");
                    return;
                }
            }
            String string = obj.toString();
            if (!string.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !string.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                if (string.startsWith("wrap")) {
                    layoutParams.height = -2;
                    return;
                }
                return;
            }
            layoutParams.height = -1;
        } catch (Exception e) {
            C13219q0.m37816b("ComponentLayoutParams", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: x */
    private static void m36151x(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (!(obj instanceof Integer)) {
                C13219q0.m37816b("ComponentLayoutParams", "handleMargin 无效");
            } else {
                int iIntValue = ((Integer) obj).intValue();
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(iIntValue, iIntValue, iIntValue, iIntValue);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private static void m36152y(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (obj instanceof Integer) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ((Integer) obj).intValue();
            } else {
                C13219q0.m37816b("ComponentLayoutParams", "handleMarginBottom 无效");
            }
        }
    }

    /* JADX INFO: renamed from: z */
    private static void m36153z(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (!(obj instanceof Integer)) {
                C13219q0.m37816b("ComponentLayoutParams", "handleMarginEnd 无效");
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(((Integer) obj).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36128a(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(2, ((Integer) obj).intValue());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    private static int m36126a(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (String str2 : str.split("\\|")) {
            String lowerCase = str2.trim().toLowerCase();
            lowerCase.hashCode();
            lowerCase.hashCode();
            int i2 = 8;
            byte b = -1;
            switch (lowerCase.hashCode()) {
                case -1633016142:
                    if (lowerCase.equals("fill_vertical")) {
                        b = 0;
                    }
                    break;
                case -1383228885:
                    if (lowerCase.equals("bottom")) {
                        b = 1;
                    }
                    break;
                case -1364013995:
                    if (lowerCase.equals("center")) {
                        b = 2;
                    }
                    break;
                case -831189901:
                    if (lowerCase.equals("clip_horizontal")) {
                        b = 3;
                    }
                    break;
                case -483365792:
                    if (lowerCase.equals("fill_horizontal")) {
                        b = 4;
                    }
                    break;
                case -348726240:
                    if (lowerCase.equals("center_vertical")) {
                        b = 5;
                    }
                    break;
                case -55726203:
                    if (lowerCase.equals("clip_vertical")) {
                        b = 6;
                    }
                    break;
                case 100571:
                    if (lowerCase.equals("end")) {
                        b = 7;
                    }
                    break;
                case 115029:
                    if (lowerCase.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                        b = 8;
                    }
                    break;
                case 3143043:
                    if (lowerCase.equals("fill")) {
                        b = 9;
                    }
                    break;
                case 3317767:
                    if (lowerCase.equals("left")) {
                        b = 10;
                    }
                    break;
                case 108511772:
                    if (lowerCase.equals("right")) {
                        b = Ascii.f22503VT;
                    }
                    break;
                case 109757538:
                    if (lowerCase.equals("start")) {
                        b = Ascii.f22492FF;
                    }
                    break;
                case 1063616078:
                    if (lowerCase.equals("center_horizontal")) {
                        b = Ascii.f22490CR;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    i2 = 112;
                    break;
                case 1:
                    i2 = 80;
                    break;
                case 2:
                    i2 = 17;
                    break;
                case 3:
                    break;
                case 4:
                    i2 = 7;
                    break;
                case 5:
                    i2 = 16;
                    break;
                case 6:
                    i2 = 128;
                    break;
                case 7:
                    i2 = GravityCompat.END;
                    break;
                case 8:
                    i2 = 48;
                    break;
                case 9:
                    i2 = Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                    break;
                case 10:
                    i2 = 3;
                    break;
                case 11:
                    i2 = 5;
                    break;
                case 12:
                    i2 = GravityCompat.START;
                    break;
                case 13:
                    i2 = 1;
                    break;
                default:
                    continue;
                    break;
            }
            i |= i2;
        }
        return i;
    }
}
