package com.mbridge.msdk.config.dynamic.utils;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.mbridge.msdk.config.dynamic.C12898c;
import com.mbridge.msdk.config.dynamic.binddata.C12893a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.utils.a */
/* JADX INFO: compiled from: ComponentAttribute.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12899a {

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.utils.a$a */
    /* JADX INFO: compiled from: ComponentAttribute.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f34707a;

        static {
            int[] iArr = new int[EnumC12901c.values().length];
            f34707a = iArr;
            try {
                iArr[EnumC12901c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34707a[EnumC12901c.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34707a[EnumC12901c.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34707a[EnumC12901c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34707a[EnumC12901c.padding.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34707a[EnumC12901c.paddingTop.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34707a[EnumC12901c.paddingBottom.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34707a[EnumC12901c.paddingLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34707a[EnumC12901c.paddingRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34707a[EnumC12901c.paddingStart.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34707a[EnumC12901c.paddingEnd.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34707a[EnumC12901c.alpha.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34707a[EnumC12901c.rotation.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34707a[EnumC12901c.scaleX.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f34707a[EnumC12901c.scaleY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f34707a[EnumC12901c.translationX.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f34707a[EnumC12901c.translationY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f34707a[EnumC12901c.tag.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f34707a[EnumC12901c.text.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f34707a[EnumC12901c.textColor.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f34707a[EnumC12901c.textSize.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f34707a[EnumC12901c.textStyle.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f34707a[EnumC12901c.maxLines.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f34707a[EnumC12901c.minLines.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f34707a[EnumC12901c.lines.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f34707a[EnumC12901c.ellipsize.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f34707a[EnumC12901c.gravity.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f34707a[EnumC12901c.drawablePadding.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f34707a[EnumC12901c.drawableStart.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f34707a[EnumC12901c.drawableEnd.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f34707a[EnumC12901c.drawableTop.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f34707a[EnumC12901c.drawableBottom.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f34707a[EnumC12901c.singleLine.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f34707a[EnumC12901c.marqueeRepeatLimit.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f34707a[EnumC12901c.includeFontPadding.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f34707a[EnumC12901c.lineSpacingExtra.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f34707a[EnumC12901c.lineSpacingMultiplier.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f34707a[EnumC12901c.hint.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f34707a[EnumC12901c.inputType.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f34707a[EnumC12901c.textIsSelectable.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f34707a[EnumC12901c.cursorVisible.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f34707a[EnumC12901c.allCaps.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f34707a[EnumC12901c.src.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f34707a[EnumC12901c.scaleType.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f34707a[EnumC12901c.adjustViewBounds.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f34707a[EnumC12901c.maxWidth.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f34707a[EnumC12901c.maxHeight.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f34707a[EnumC12901c.tint.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f34707a[EnumC12901c.divider.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f34707a[EnumC12901c.dividerHeight.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f34707a[EnumC12901c.scrollbars.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f34707a[EnumC12901c.listSelector.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f34707a[EnumC12901c.stackFromBottom.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f34707a[EnumC12901c.transcriptMode.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f34707a[EnumC12901c.numColumns.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f34707a[EnumC12901c.verticalSpacing.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f34707a[EnumC12901c.horizontalSpacing.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f34707a[EnumC12901c.stretchMode.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f34707a[EnumC12901c.columnWidth.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f34707a[EnumC12901c.fillViewport.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f34707a[EnumC12901c.scrollbarStyle.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f34707a[EnumC12901c.orientation.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f34707a[EnumC12901c.weightSum.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f34707a[EnumC12901c.baselineAligned.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f34707a[EnumC12901c.ignoreGravity.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f34707a[EnumC12901c.foregroundGravity.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f34707a[EnumC12901c.measureAllChildren.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f34707a[EnumC12901c.progress.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f34707a[EnumC12901c.max.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f34707a[EnumC12901c.progressDrawable.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m36079a(View view, AttributeSet attributeSet, ViewGroup viewGroup, C12894a c12894a) {
        if (view == null || attributeSet == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParamsM36078a = m36078a(viewGroup);
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = attributeSet.getAttributeName(i);
            String attributeValue = attributeSet.getAttributeValue(i);
            if (attributeName.startsWith("mbridge_")) {
                C12893a.m36039a(attributeValue, view, c12894a);
            } else {
                Object objM36158a = C12902d.m36158a(attributeName, attributeValue, view, c12894a);
                if (objM36158a != null) {
                    m36082a(view, attributeName, attributeSet.getAttributeValue(i), objM36158a);
                    C12900b.m36127a(attributeName, objM36158a, layoutParamsM36078a);
                }
            }
        }
        if (viewGroup != null) {
            viewGroup.addView(view, layoutParamsM36078a);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m36095b(View view, Object obj) {
        if (obj instanceof String) {
            view.setContentDescription((String) obj);
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m36097c(View view, Object obj) {
        if (obj instanceof Integer) {
            view.setId(((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m36099d(View view, Object obj) {
        try {
            if (obj instanceof Integer) {
                view.setPadding(((Integer) obj).intValue(), ((Integer) obj).intValue(), ((Integer) obj).intValue(), ((Integer) obj).intValue());
            } else {
                C13219q0.m37816b("AttributeUtil", "padding 无效");
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m36101e(View view, Object obj) {
        int iIntValue;
        try {
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                C13219q0.m37816b("AttributeUtil", "bottomPadding 无效");
                iIntValue = 0;
            }
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iIntValue);
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m36102f(View view, Object obj) {
        int iIntValue;
        try {
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                C13219q0.m37816b("AttributeUtil", "endPadding 无效");
                iIntValue = 0;
            }
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), iIntValue, view.getPaddingBottom());
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m36103g(View view, Object obj) {
        int iIntValue;
        try {
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                C13219q0.m37816b("AttributeUtil", "leftPadding 无效");
                iIntValue = 0;
            }
            view.setPadding(iIntValue, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m36104h(View view, Object obj) {
        int iIntValue;
        try {
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                C13219q0.m37816b("AttributeUtil", "rightPadding 无效");
                iIntValue = 0;
            }
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), iIntValue, view.getPaddingBottom());
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m36105i(View view, Object obj) {
        int iIntValue;
        try {
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                C13219q0.m37816b("AttributeUtil", "startPadding 无效");
                iIntValue = 0;
            }
            view.setPaddingRelative(iIntValue, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: j */
    private static void m36106j(View view, Object obj) {
        int iIntValue;
        try {
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                C13219q0.m37816b("AttributeUtil", "parsePaddingTop 无效");
                iIntValue = 0;
            }
            view.setPadding(view.getPaddingLeft(), iIntValue, view.getPaddingRight(), view.getPaddingBottom());
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: k */
    private static void m36107k(View view, Object obj) {
        try {
            if (obj instanceof String) {
                view.setRotation(Float.parseFloat((String) obj));
                return;
            }
            if (obj instanceof Float) {
                view.setRotation(((Float) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                view.setRotation(((Double) obj).floatValue());
            } else if (obj instanceof Integer) {
                view.setRotation(((Integer) obj).floatValue());
            } else {
                C13219q0.m37816b("AttributeUtil", "rotation 无效");
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: l */
    private static void m36108l(View view, Object obj) {
        try {
            if (obj instanceof String) {
                view.setScaleX(Float.parseFloat((String) obj));
                return;
            }
            if (obj instanceof Float) {
                view.setScaleX(((Float) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                view.setScaleX(((Double) obj).floatValue());
            } else if (obj instanceof Integer) {
                view.setScaleX(((Integer) obj).floatValue());
            } else {
                C13219q0.m37816b("AttributeUtil", "scaleX 无效");
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: m */
    private static void m36109m(View view, Object obj) {
        try {
            if (obj instanceof String) {
                view.setScaleY(Float.parseFloat((String) obj));
                return;
            }
            if (obj instanceof Float) {
                view.setScaleY(((Float) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                view.setScaleY(((Double) obj).floatValue());
            } else if (obj instanceof Integer) {
                view.setScaleY(((Integer) obj).floatValue());
            } else {
                C13219q0.m37816b("AttributeUtil", "scaleY 无效");
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m36110n(View view, Object obj) {
        if (!(obj instanceof String) || TextUtils.isEmpty((String) obj)) {
            return;
        }
        view.setTag(obj);
    }

    /* JADX INFO: renamed from: o */
    private static void m36111o(View view, Object obj) {
        try {
            if (obj instanceof String) {
                view.setTranslationX(Float.parseFloat((String) obj));
                return;
            }
            if (obj instanceof Float) {
                view.setTranslationX(((Float) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                view.setTranslationX(((Double) obj).floatValue());
            } else if (obj instanceof Integer) {
                view.setTranslationX(((Integer) obj).floatValue());
            } else {
                C13219q0.m37816b("AttributeUtil", "translationX 无效");
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m36112p(View view, Object obj) {
        try {
            if (obj instanceof String) {
                view.setTranslationY(Float.parseFloat((String) obj));
                return;
            }
            if (obj instanceof Float) {
                view.setTranslationY(((Float) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                view.setTranslationY(((Double) obj).floatValue());
            } else if (obj instanceof Integer) {
                view.setTranslationY(((Integer) obj).floatValue());
            } else {
                C13219q0.m37816b("AttributeUtil", "translationY 无效");
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m36113q(View view, Object obj) {
        try {
            if (obj instanceof String) {
                if ("gone".equalsIgnoreCase((String) obj)) {
                    view.setVisibility(8);
                } else if ("invisible".equalsIgnoreCase((String) obj)) {
                    view.setVisibility(4);
                } else {
                    view.setVisibility(0);
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private static ImageView.ScaleType m36094b(String str) {
        if (TextUtils.isEmpty(str)) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitend":
                return ImageView.ScaleType.FIT_END;
            case "matrix":
                return ImageView.ScaleType.MATRIX;
            case "fitstart":
                return ImageView.ScaleType.FIT_START;
            case "fitxy":
                return ImageView.ScaleType.FIT_XY;
            case "centerinside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "centercrop":
                return ImageView.ScaleType.CENTER_CROP;
            case "fitcenter":
                return ImageView.ScaleType.FIT_CENTER;
            default:
                return ImageView.ScaleType.FIT_CENTER;
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m36096c(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "insideinset":
                return 16777216;
            case "outsideinset":
                return 50331648;
            case "outsideoverlay":
                return 33554432;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    private static int m36098d(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "spacing":
                return 1;
            case "columnwidth":
                return 2;
            case "spacinguniform":
                return 3;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    private static int m36100e(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        if (lowerCase.equals(Constants.NORMAL)) {
            return 1;
        }
        return !lowerCase.equals("alwaysscroll") ? 0 : 2;
    }

    /* JADX INFO: renamed from: a */
    public static void m36082a(View view, String str, String str2, Object obj) {
        EnumC12901c enumC12901c;
        HashMap<String, EnumC12901c> mapM36074c = C12898c.m36066a().m36074c();
        if (mapM36074c == null || mapM36074c.isEmpty() || (enumC12901c = mapM36074c.get(str)) == null) {
            return;
        }
        try {
            switch (a.f34707a[enumC12901c.ordinal()]) {
                case 1:
                    m36097c(view, obj);
                    break;
                case 2:
                    m36081a(view, obj, str2);
                    break;
                case 3:
                    m36113q(view, obj);
                    break;
                case 4:
                    m36095b(view, obj);
                    break;
                case 5:
                    m36099d(view, obj);
                    break;
                case 6:
                    m36106j(view, obj);
                    break;
                case 7:
                    m36101e(view, obj);
                    break;
                case 8:
                    m36103g(view, obj);
                    break;
                case 9:
                    m36104h(view, obj);
                    break;
                case 10:
                    m36105i(view, obj);
                    break;
                case 11:
                    m36102f(view, obj);
                    break;
                case 12:
                    m36080a(view, obj);
                    break;
                case 13:
                    m36107k(view, obj);
                    break;
                case 14:
                    m36108l(view, obj);
                    break;
                case 15:
                    m36109m(view, obj);
                    break;
                case 16:
                    m36111o(view, obj);
                    break;
                case 17:
                    m36112p(view, obj);
                    break;
                case 18:
                    m36110n(view, obj);
                    break;
                default:
                    if (view instanceof EditText) {
                        m36084a((EditText) view, enumC12901c, obj);
                    } else if (view instanceof Button) {
                        m36083a((Button) view, enumC12901c, obj);
                    } else if (view instanceof TextView) {
                        m36093a((TextView) view, enumC12901c, obj);
                    } else if (view instanceof ImageView) {
                        m36087a((ImageView) view, enumC12901c, obj);
                    } else if (view instanceof ListView) {
                        m36089a((ListView) view, enumC12901c, obj, str2);
                    } else if (view instanceof GridView) {
                        m36086a((GridView) view, enumC12901c, obj);
                    } else if (view instanceof ScrollView) {
                        m36092a((ScrollView) view, enumC12901c, obj);
                    } else if (view instanceof LinearLayout) {
                        m36088a((LinearLayout) view, enumC12901c, obj);
                    } else if (view instanceof RelativeLayout) {
                        m36091a((RelativeLayout) view, enumC12901c, obj);
                    } else if (view instanceof FrameLayout) {
                        m36085a((FrameLayout) view, enumC12901c, obj);
                    } else if (view instanceof ProgressBar) {
                        m36090a((ProgressBar) view, enumC12901c, obj);
                    }
                    break;
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", "Error setting common attribute " + str + ": " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36081a(View view, Object obj, String str) {
        if (obj instanceof Integer) {
            if (str.startsWith("#")) {
                view.setBackgroundColor(((Integer) obj).intValue());
            } else if (str.startsWith("@drawable/")) {
                view.setBackgroundResource(((Integer) obj).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36080a(View view, Object obj) {
        try {
            if (obj instanceof String) {
                float f = Float.parseFloat((String) obj);
                if (f < 0.0f || f > 1.0f) {
                    return;
                }
                view.setAlpha(f);
                return;
            }
            if (obj instanceof Float) {
                float fFloatValue = ((Float) obj).floatValue();
                if (fFloatValue < 0.0f || fFloatValue > 1.0f) {
                    return;
                }
                view.setAlpha(fFloatValue);
                return;
            }
            if (obj instanceof Double) {
                float fFloatValue2 = ((Double) obj).floatValue();
                if (fFloatValue2 < 0.0f || fFloatValue2 > 1.0f) {
                    return;
                }
                view.setAlpha(fFloatValue2);
                return;
            }
            C13219q0.m37816b("AttributeUtil", "alpha 无效");
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36093a(TextView textView, EnumC12901c enumC12901c, Object obj) {
        try {
            switch (a.f34707a[enumC12901c.ordinal()]) {
                case 19:
                    if (obj instanceof String) {
                        textView.setText(obj.toString());
                        return;
                    }
                    return;
                case 20:
                    if (obj instanceof Integer) {
                        textView.setTextColor(((Integer) obj).intValue());
                        return;
                    }
                    return;
                case 21:
                    try {
                        if (obj instanceof Integer) {
                            textView.setTextSize(0, ((Integer) obj).intValue());
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        C13219q0.m37816b("AttributeUtil", "Failed to set textSize: " + e.getMessage());
                        return;
                    }
                case 22:
                    if ((obj instanceof String) && "bold".equalsIgnoreCase(obj.toString())) {
                        textView.setTypeface(Typeface.defaultFromStyle(1));
                        return;
                    }
                    return;
                case 23:
                    if (obj instanceof String) {
                        textView.setMaxLines(Integer.parseInt(obj.toString()));
                        return;
                    }
                    return;
                case 24:
                    if (obj instanceof String) {
                        textView.setMinLines(Integer.parseInt(obj.toString()));
                        return;
                    }
                    return;
                case 25:
                    if (obj instanceof String) {
                        textView.setLines(Integer.parseInt(obj.toString()));
                        return;
                    }
                    return;
                case 26:
                    if (obj instanceof String) {
                        if ("end".equalsIgnoreCase(obj.toString())) {
                            textView.setEllipsize(TextUtils.TruncateAt.END);
                            return;
                        }
                        if ("start".equalsIgnoreCase(obj.toString())) {
                            textView.setEllipsize(TextUtils.TruncateAt.START);
                            return;
                        } else if ("middle".equalsIgnoreCase(obj.toString())) {
                            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                            return;
                        } else {
                            if ("marquee".equalsIgnoreCase(obj.toString())) {
                                textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                case 27:
                    if (obj instanceof String) {
                        textView.setGravity(C12898c.m36066a().m36073c(obj.toString()));
                        return;
                    }
                    return;
                case 28:
                    if (obj instanceof Integer) {
                        textView.setCompoundDrawablePadding(((Integer) obj).intValue());
                        return;
                    }
                    return;
                case 29:
                case 30:
                case 31:
                case 32:
                default:
                    return;
                case 33:
                    if (obj instanceof String) {
                        textView.setSingleLine(Boolean.parseBoolean(obj.toString()));
                        return;
                    }
                    return;
                case 34:
                    if (obj instanceof String) {
                        textView.setMarqueeRepeatLimit(Integer.parseInt(obj.toString()));
                        return;
                    }
                    return;
                case 35:
                    if (obj instanceof String) {
                        textView.setIncludeFontPadding(Boolean.parseBoolean(obj.toString()));
                        return;
                    }
                    return;
                case 36:
                    if (obj instanceof String) {
                        textView.setLineSpacing(Integer.parseInt(obj.toString()), 1.0f);
                        return;
                    }
                    return;
                case 37:
                    if (obj instanceof String) {
                        textView.setLineSpacing(0.0f, Float.parseFloat(obj.toString()));
                        return;
                    }
                    return;
            }
        } catch (Exception e2) {
            C13219q0.m37816b("AttributeUtil", e2.getMessage());
        }
        C13219q0.m37816b("AttributeUtil", e2.getMessage());
    }

    /* JADX INFO: renamed from: a */
    private static void m36084a(EditText editText, EnumC12901c enumC12901c, Object obj) {
        try {
            if (!(obj instanceof String)) {
                C13219q0.m37816b("AttributeUtil", enumC12901c + "无效");
            }
            String string = obj.toString();
            int i = a.f34707a[enumC12901c.ordinal()];
            switch (i) {
                case 23:
                    editText.setMaxLines(Integer.parseInt(string));
                    break;
                case 24:
                    editText.setMinLines(Integer.parseInt(string));
                    break;
                case 25:
                    editText.setLines(Integer.parseInt(string));
                    break;
                default:
                    switch (i) {
                        case 38:
                            editText.setHint(obj.toString());
                            break;
                        case 39:
                            editText.setInputType(m36077a(string));
                            break;
                        case 40:
                            editText.setTextIsSelectable(Boolean.parseBoolean(string));
                            break;
                        case 41:
                            editText.setCursorVisible(Boolean.parseBoolean(string));
                            break;
                        default:
                            break;
                    }
                    break;
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36083a(Button button, EnumC12901c enumC12901c, Object obj) {
        try {
            int i = a.f34707a[enumC12901c.ordinal()];
            if (i != 42) {
                switch (i) {
                    case 19:
                        if (obj instanceof String) {
                            button.setText(obj.toString());
                        }
                        break;
                    case 20:
                        if (obj instanceof Integer) {
                            button.setTextColor(((Integer) obj).intValue());
                        }
                        break;
                    case 21:
                        if (obj instanceof Integer) {
                            button.setTextSize(((Integer) obj).intValue());
                        }
                        break;
                    case 22:
                        if ((obj instanceof String) && "bold".equalsIgnoreCase(obj.toString())) {
                            button.setTypeface(Typeface.defaultFromStyle(1));
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
            if (obj instanceof String) {
                button.setAllCaps(Boolean.parseBoolean(obj.toString()));
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36087a(ImageView imageView, EnumC12901c enumC12901c, Object obj) {
        try {
            switch (a.f34707a[enumC12901c.ordinal()]) {
                case 43:
                    if (obj instanceof Integer) {
                        imageView.setImageResource(((Integer) obj).intValue());
                    }
                    break;
                case 44:
                    if (obj instanceof String) {
                        imageView.setScaleType(m36094b(obj.toString()));
                    }
                    break;
                case 45:
                    if (obj instanceof String) {
                        imageView.setAdjustViewBounds(Boolean.parseBoolean(obj.toString()));
                    }
                    break;
                case 46:
                    if (obj instanceof Integer) {
                        imageView.setMaxWidth(((Integer) obj).intValue());
                    }
                    break;
                case 47:
                    if (obj instanceof Integer) {
                        imageView.setMaxHeight(((Integer) obj).intValue());
                    }
                    break;
                case 48:
                    if (obj instanceof Integer) {
                        imageView.setColorFilter(((Integer) obj).intValue());
                    }
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36089a(ListView listView, EnumC12901c enumC12901c, Object obj, String str) {
        try {
            switch (a.f34707a[enumC12901c.ordinal()]) {
                case 49:
                    if (!TextUtils.isEmpty(str) && str.startsWith("@null")) {
                        listView.setDivider(null);
                        break;
                    }
                    break;
                case 50:
                    if (obj instanceof Integer) {
                        listView.setDividerHeight(((Integer) obj).intValue());
                    }
                    break;
                case 51:
                    if (obj instanceof String) {
                        if ("none".equalsIgnoreCase(obj.toString())) {
                            listView.setVerticalScrollBarEnabled(false);
                        }
                        if ("false".equalsIgnoreCase(obj.toString())) {
                            listView.setScrollbarFadingEnabled(false);
                        }
                    }
                    break;
                case 52:
                    if (obj instanceof Integer) {
                        listView.setSelector(((Integer) obj).intValue());
                    }
                    break;
                case 53:
                    if (obj instanceof String) {
                        listView.setStackFromBottom(Boolean.parseBoolean(obj.toString()));
                    }
                    break;
                case 54:
                    if (!TextUtils.isEmpty(str)) {
                        listView.setTranscriptMode(m36100e(str));
                    }
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36086a(GridView gridView, EnumC12901c enumC12901c, Object obj) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                switch (a.f34707a[enumC12901c.ordinal()]) {
                    case 55:
                        gridView.setNumColumns(Integer.parseInt(str));
                        break;
                    case 56:
                        gridView.setVerticalSpacing(C12898c.m36066a().m36068a(str));
                        break;
                    case 57:
                        gridView.setHorizontalSpacing(C12898c.m36066a().m36068a(str));
                        break;
                    case 58:
                        if (!TextUtils.isEmpty(str)) {
                            gridView.setStretchMode(m36098d(str));
                        }
                        break;
                    case 59:
                        gridView.setColumnWidth(C12898c.m36066a().m36068a(str));
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36092a(ScrollView scrollView, EnumC12901c enumC12901c, Object obj) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                int i = a.f34707a[enumC12901c.ordinal()];
                if (i != 51) {
                    if (i != 60) {
                        if (i == 61 && !TextUtils.isEmpty(str)) {
                            scrollView.setScrollBarStyle(m36096c(str));
                            return;
                        }
                        return;
                    }
                    scrollView.setFillViewport(Boolean.parseBoolean(str));
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if ("none".equalsIgnoreCase(str)) {
                    scrollView.setVerticalScrollBarEnabled(false);
                }
                if ("false".equalsIgnoreCase(str)) {
                    scrollView.setScrollbarFadingEnabled(false);
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36088a(LinearLayout linearLayout, EnumC12901c enumC12901c, Object obj) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                int i = a.f34707a[enumC12901c.ordinal()];
                if (i != 27) {
                    switch (i) {
                        case 62:
                            if (MessengerShareContentUtility.IMAGE_RATIO_HORIZONTAL.equalsIgnoreCase(str)) {
                                linearLayout.setOrientation(0);
                            } else {
                                linearLayout.setOrientation(1);
                            }
                            break;
                        case 63:
                            linearLayout.setWeightSum(Float.parseFloat(str));
                            break;
                        case 64:
                            linearLayout.setBaselineAligned(Boolean.parseBoolean(str));
                            break;
                        default:
                            break;
                    }
                }
                linearLayout.setGravity(C12898c.m36066a().m36073c(str));
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36091a(RelativeLayout relativeLayout, EnumC12901c enumC12901c, Object obj) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                int i = a.f34707a[enumC12901c.ordinal()];
                if (i == 27) {
                    relativeLayout.setGravity(C12898c.m36066a().m36073c(str));
                } else {
                    if (i != 65) {
                        return;
                    }
                    relativeLayout.setIgnoreGravity(C12898c.m36066a().m36075d(str));
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36085a(FrameLayout frameLayout, EnumC12901c enumC12901c, Object obj) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                int i = a.f34707a[enumC12901c.ordinal()];
                if (i == 66) {
                    frameLayout.setForegroundGravity(C12898c.m36066a().m36073c(str));
                } else {
                    if (i != 67) {
                        return;
                    }
                    frameLayout.setMeasureAllChildren(Boolean.parseBoolean(str));
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36090a(ProgressBar progressBar, EnumC12901c enumC12901c, Object obj) {
        try {
            switch (a.f34707a[enumC12901c.ordinal()]) {
                case 68:
                    try {
                        if (obj instanceof String) {
                            progressBar.setProgress(Integer.parseInt(obj.toString()));
                            return;
                        } else {
                            if (obj instanceof Integer) {
                                progressBar.setProgress(((Integer) obj).intValue());
                                return;
                            }
                            return;
                        }
                    } catch (Exception e) {
                        C13219q0.m37816b("AttributeUtil", "Failed to set progress: " + e.getMessage());
                        return;
                    }
                case 69:
                    try {
                        if (obj instanceof String) {
                            progressBar.setMax(Integer.parseInt(obj.toString()));
                            return;
                        } else {
                            if (obj instanceof Integer) {
                                progressBar.setMax(((Integer) obj).intValue());
                                return;
                            }
                            return;
                        }
                    } catch (Exception e2) {
                        C13219q0.m37816b("AttributeUtil", "Failed to set max: " + e2.getMessage());
                        return;
                    }
                case 70:
                    try {
                        Drawable drawable = obj instanceof Integer ? C13008c.m36588n().m36542d().getResources().getDrawable(((Integer) obj).intValue(), C13008c.m36588n().m36542d().getTheme()) : null;
                        if (drawable != null) {
                            progressBar.setProgressDrawable(drawable);
                            return;
                        }
                        return;
                    } catch (Exception e3) {
                        C13219q0.m37816b("AttributeUtil", "Failed to set progressDrawable: " + e3.getMessage());
                        return;
                    }
                default:
                    return;
            }
        } catch (Throwable th) {
            C13219q0.m37816b("AttributeUtil", th.getMessage());
        }
        C13219q0.m37816b("AttributeUtil", th.getMessage());
    }

    /* JADX INFO: renamed from: a */
    private static int m36077a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "number":
                return 2;
            case "date":
                return 20;
            case "time":
                return 36;
            case "phone":
                return 3;
            case "textpassword":
                return 129;
            case "datetime":
                return 4;
            default:
                return 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private static ViewGroup.LayoutParams m36078a(ViewGroup viewGroup) {
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof GridLayout) {
            return new GridLayout.LayoutParams();
        }
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
