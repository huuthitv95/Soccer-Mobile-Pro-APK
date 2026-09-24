package com.mbridge.msdk.dycreator.utils;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.dycreator.baseview.MBHorizontalScrollView;
import com.mbridge.msdk.dycreator.engine.C12972b;
import com.mbridge.msdk.dycreator.engine.EnumC12973c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.playercommon.PlayerView;
import java.util.HashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.utils.a */
/* JADX INFO: compiled from: AttributeUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12978a {

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.utils.a$a */
    /* JADX INFO: compiled from: AttributeUtil.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f35376a;

        static {
            int[] iArr = new int[EnumC12973c.values().length];
            f35376a = iArr;
            try {
                iArr[EnumC12973c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35376a[EnumC12973c.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35376a[EnumC12973c.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35376a[EnumC12973c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35376a[EnumC12973c.padding.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35376a[EnumC12973c.paddingTop.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35376a[EnumC12973c.paddingBottom.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35376a[EnumC12973c.paddingLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35376a[EnumC12973c.paddingRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35376a[EnumC12973c.paddingStart.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35376a[EnumC12973c.paddingEnd.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35376a[EnumC12973c.orientation.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35376a[EnumC12973c.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35376a[EnumC12973c.ellipsize.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35376a[EnumC12973c.fadingEdge.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35376a[EnumC12973c.scrollHorizontally.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35376a[EnumC12973c.textColor.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f35376a[EnumC12973c.textSize.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f35376a[EnumC12973c.textStyle.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f35376a[EnumC12973c.style.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f35376a[EnumC12973c.tag.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f35376a[EnumC12973c.gravity.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f35376a[EnumC12973c.verticalSpacing.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f35376a[EnumC12973c.numColumns.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f35376a[EnumC12973c.splitMotionEvents.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f35376a[EnumC12973c.cacheColorHint.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f35376a[EnumC12973c.horizontalSpacing.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f35376a[EnumC12973c.singleLine.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f35376a[EnumC12973c.lines.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f35376a[EnumC12973c.drawableLeft.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f35376a[EnumC12973c.drawablePadding.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f35376a[EnumC12973c.src.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f35376a[EnumC12973c.scaleType.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f35376a[EnumC12973c.divider.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f35376a[EnumC12973c.scrollbars.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f35376a[EnumC12973c.listSelector.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36383a() {
    }

    /* JADX INFO: renamed from: a */
    public static void m36384a(View view, AttributeSet attributeSet) {
        if (view == null || attributeSet == null) {
            return;
        }
        try {
            HashMap<String, EnumC12973c> mapM36370c = C12972b.m36361a().m36370c();
            if (mapM36370c != null && !mapM36370c.isEmpty()) {
                int attributeCount = attributeSet.getAttributeCount();
                int iM36362a = 0;
                int iM36362a2 = 0;
                int iM36362a3 = 0;
                int iM36362a4 = 0;
                for (int i = 0; i < attributeCount; i++) {
                    EnumC12973c enumC12973c = mapM36370c.get(attributeSet.getAttributeName(i));
                    if (enumC12973c != null) {
                        switch (a.f35376a[enumC12973c.ordinal()]) {
                            case 1:
                                m36397b(view, attributeSet.getAttributeValue(i));
                                break;
                            case 2:
                                m36398c(view, attributeSet.getAttributeValue(i));
                                break;
                            case 3:
                                m36399d(view, attributeSet.getAttributeValue(i));
                                break;
                            case 4:
                                m36385a(view, attributeSet.getAttributeValue(i));
                                break;
                            case 5:
                                int iM36362a5 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                                view.setPadding(iM36362a5, iM36362a5, iM36362a5, iM36362a5);
                                break;
                            case 6:
                                iM36362a2 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                                view.setPadding(iM36362a, iM36362a2, iM36362a3, iM36362a4);
                                break;
                            case 7:
                                iM36362a4 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                                view.setPadding(iM36362a, iM36362a2, iM36362a3, iM36362a4);
                                break;
                            case 8:
                                iM36362a = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                                view.setPadding(iM36362a, iM36362a2, iM36362a3, iM36362a4);
                                break;
                            case 9:
                                iM36362a3 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                                view.setPadding(iM36362a, iM36362a2, iM36362a3, iM36362a4);
                                break;
                            case 10:
                                view.setPadding(C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i)), iM36362a2, iM36362a3, iM36362a4);
                                break;
                            case 11:
                                view.setPadding(iM36362a, iM36362a2, C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i)), iM36362a4);
                                break;
                        }
                        if (view instanceof EditText) {
                            m36383a();
                        } else if (view instanceof Button) {
                            m36386a((Button) view, enumC12973c, attributeSet, i);
                        } else if (view instanceof TextView) {
                            m36394a((TextView) view, enumC12973c, attributeSet, i);
                        } else if (view instanceof ImageView) {
                            m36389a((ImageView) view, enumC12973c, attributeSet, i);
                        } else if (view instanceof ListView) {
                            m36391a((ListView) view, enumC12973c, attributeSet, i);
                        } else if (view instanceof GridView) {
                            m36388a((GridView) view, enumC12973c, attributeSet, i);
                        } else if (view instanceof ScrollView) {
                            m36393a((ScrollView) view, enumC12973c, attributeSet, i);
                        } else if (view instanceof PlayerView) {
                            m36396a((PlayerView) view, enumC12973c, attributeSet, i);
                        } else if (view instanceof MBHorizontalScrollView) {
                            m36395a((MBHorizontalScrollView) view, enumC12973c, attributeSet, i);
                        } else if (view instanceof LinearLayout) {
                            m36390a((LinearLayout) view, enumC12973c, attributeSet, i);
                        } else if (view instanceof RelativeLayout) {
                            m36392a((RelativeLayout) view, enumC12973c, attributeSet, i);
                        } else if (view instanceof FrameLayout) {
                            m36387a((FrameLayout) view, enumC12973c, attributeSet, i);
                        }
                    }
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36387a(FrameLayout frameLayout, EnumC12973c enumC12973c, AttributeSet attributeSet, int i) {
    }

    /* JADX INFO: renamed from: a */
    private static void m36393a(ScrollView scrollView, EnumC12973c enumC12973c, AttributeSet attributeSet, int i) {
    }

    /* JADX INFO: renamed from: a */
    private static void m36395a(MBHorizontalScrollView mBHorizontalScrollView, EnumC12973c enumC12973c, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:2:0x0000, B:4:0x000a, B:9:0x001f, B:11:0x0025, B:6:0x0011, B:8:0x0019), top: B:16:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    private static void m36397b(View view, String str) {
        String strSubstring;
        try {
            String str2 = "";
            if (!str.startsWith("@+id/")) {
                if (str.startsWith("@id/")) {
                    strSubstring = str.substring(4);
                }
                if (TextUtils.isEmpty(str2)) {
                }
                view.setId(str2.hashCode());
            }
            strSubstring = str.substring(5);
            str2 = strSubstring;
            if (TextUtils.isEmpty(str2)) {
                view.setId(str2.hashCode());
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m36398c(View view, String str) {
        String[] strArrSplit;
        try {
            if (!str.startsWith("#")) {
                if (str.startsWith("@color/")) {
                    view.setBackgroundColor(C12972b.m36361a().m36371d(str));
                    return;
                } else {
                    if (str.startsWith("@drawable/")) {
                        view.setBackgroundResource(C13008c.m36588n().m36542d().getResources().getIdentifier(str.substring(10), "drawable", C13008c.m36588n().m36542d().getPackageName()));
                        return;
                    }
                    return;
                }
            }
            try {
                strArrSplit = str.split("-");
            } catch (Exception unused) {
                strArrSplit = null;
            }
            if (strArrSplit != null && strArrSplit.length <= 2) {
                view.setBackgroundColor(C12972b.m36361a().m36371d(str));
                return;
            }
            if (strArrSplit == null || strArrSplit.length != 3) {
                return;
            }
            GradientDrawable gradientDrawableM36363a = C12972b.m36361a().m36363a(strArrSplit);
            if (gradientDrawableM36363a != null) {
                view.setBackground(gradientDrawableM36363a);
            } else {
                view.setBackgroundColor(C12972b.m36361a().m36371d(str));
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m36399d(View view, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.equals("invisible")) {
                view.setVisibility(4);
            } else if (str.equalsIgnoreCase("gone")) {
                view.setVisibility(8);
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36396a(PlayerView playerView, EnumC12973c enumC12973c, AttributeSet attributeSet, int i) {
        try {
            if (a.f35376a[enumC12973c.ordinal()] != 12) {
                return;
            }
            if (MessengerShareContentUtility.IMAGE_RATIO_HORIZONTAL.equalsIgnoreCase(attributeSet.getAttributeValue(i))) {
                playerView.setOrientation(0);
            } else {
                playerView.setOrientation(1);
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36386a(Button button, EnumC12973c enumC12973c, AttributeSet attributeSet, int i) {
        try {
            switch (a.f35376a[enumC12973c.ordinal()]) {
                case 13:
                    button.setText(C12972b.m36361a().m36374f(attributeSet.getAttributeValue(i)));
                    break;
                case 14:
                    if (attributeSet.getAttributeBooleanValue(i, false)) {
                        button.setFocusable(true);
                        button.setFocusableInTouchMode(true);
                        button.setSingleLine(true);
                        button.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                        button.setMarqueeRepeatLimit(1000);
                        button.setSingleLine();
                        button.setHorizontallyScrolling(true);
                        button.requestFocus();
                    }
                    break;
                case 15:
                    button.setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i, false));
                    break;
                case 16:
                    button.setHorizontallyScrolling(attributeSet.getAttributeBooleanValue(i, false));
                    break;
                case 17:
                    button.setTextColor(C12972b.m36361a().m36371d(attributeSet.getAttributeValue(i)));
                    break;
                case 18:
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        button.setTextSize(C12972b.m36361a().m36362a(attributeValue));
                    }
                    break;
                case 19:
                    if ("bold".equalsIgnoreCase(attributeSet.getAttributeValue(i))) {
                        button.setTypeface(Typeface.defaultFromStyle(1));
                    }
                    break;
                case 20:
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    String strSubstring = attributeValue2.substring(attributeValue2.indexOf(RemoteSettings.FORWARD_SLASH_STRING) + 1);
                    button.setTextAppearance(C13008c.m36588n().m36542d(), C12972b.m36361a().m36369c("R.style." + strSubstring));
                    break;
                case 21:
                    String attributeValue3 = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue3)) {
                        String str = C12979b.f35377a.get(attributeValue3.substring(8));
                        if (!TextUtils.isEmpty(str)) {
                            button.setTag(str);
                        }
                    }
                    break;
                case 22:
                    button.setGravity(1);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36388a(GridView gridView, EnumC12973c enumC12973c, AttributeSet attributeSet, int i) {
        try {
            int i2 = a.f35376a[enumC12973c.ordinal()];
            if (i2 != 1) {
                switch (i2) {
                    case 23:
                        gridView.setVerticalSpacing(C12982e.m36416e(C13008c.m36588n().m36542d(), C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i))));
                        break;
                    case 24:
                        gridView.setNumColumns(attributeSet.getAttributeIntValue(i, 2));
                        break;
                    case 25:
                        gridView.setMotionEventSplittingEnabled(!attributeSet.getAttributeValue(i).equals("false"));
                        break;
                    case 26:
                        gridView.setCacheColorHint(C12972b.m36361a().m36371d(attributeSet.getAttributeValue(i)));
                        break;
                    case 27:
                        gridView.setHorizontalSpacing(C12982e.m36416e(C13008c.m36588n().m36542d(), C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i))));
                        break;
                    default:
                        break;
                }
            }
            String attributeValue = attributeSet.getAttributeValue(i);
            if (attributeValue.startsWith("@+id/")) {
                gridView.setId(attributeValue.substring(5).hashCode());
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36385a(View view, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String str2 = C12979b.f35377a.get(str.substring(8));
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            view.setContentDescription(str2);
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36390a(LinearLayout linearLayout, EnumC12973c enumC12973c, AttributeSet attributeSet, int i) {
        try {
            if (a.f35376a[enumC12973c.ordinal()] != 12) {
                return;
            }
            if (MessengerShareContentUtility.IMAGE_RATIO_HORIZONTAL.equalsIgnoreCase(attributeSet.getAttributeValue(i))) {
                linearLayout.setOrientation(0);
            } else {
                linearLayout.setOrientation(1);
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36392a(RelativeLayout relativeLayout, EnumC12973c enumC12973c, AttributeSet attributeSet, int i) {
        try {
            if (a.f35376a[enumC12973c.ordinal()] != 22) {
                return;
            }
            relativeLayout.setGravity(C12972b.m36361a().m36367b(attributeSet.getAttributeValue(i)));
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36394a(TextView textView, EnumC12973c enumC12973c, AttributeSet attributeSet, int i) {
        try {
            int i2 = a.f35376a[enumC12973c.ordinal()];
            switch (i2) {
                case 13:
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.startsWith("@string/")) {
                            textView.setText(C12972b.m36361a().m36374f(attributeSet.getAttributeValue(i)));
                        } else {
                            textView.setText(attributeValue);
                        }
                    }
                    break;
                case 14:
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue2)) {
                        if (attributeValue2.equals("end")) {
                            textView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                        if (attributeValue2.equals("start")) {
                            textView.setEllipsize(TextUtils.TruncateAt.START);
                        }
                        if (attributeValue2.equals("middle")) {
                            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        }
                        if (attributeValue2.equals("marquee")) {
                            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                        }
                    }
                    break;
                case 15:
                    textView.setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i, false));
                    break;
                case 16:
                    textView.setHorizontallyScrolling(attributeSet.getAttributeBooleanValue(i, false));
                    break;
                case 17:
                    textView.setTextColor(C12972b.m36361a().m36371d(attributeSet.getAttributeValue(i)));
                    break;
                case 18:
                    String attributeValue3 = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue3)) {
                        textView.setTextSize(C12972b.m36361a().m36362a(attributeValue3));
                    }
                    break;
                case 19:
                    if ("bold".equalsIgnoreCase(attributeSet.getAttributeValue(i))) {
                        textView.setTypeface(Typeface.defaultFromStyle(1));
                    }
                    break;
                case 20:
                    String attributeValue4 = attributeSet.getAttributeValue(i);
                    String strSubstring = attributeValue4.substring(attributeValue4.indexOf(RemoteSettings.FORWARD_SLASH_STRING) + 1);
                    C12972b.m36361a().m36369c("R.style." + strSubstring);
                    break;
                case 21:
                    String attributeValue5 = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue5)) {
                        String str = C12979b.f35377a.get(attributeValue5.substring(8));
                        if (!TextUtils.isEmpty(str)) {
                            textView.setTag(str);
                        }
                    }
                    break;
                case 22:
                    textView.setGravity(C12972b.m36361a().m36367b(attributeSet.getAttributeValue(i)));
                    break;
                default:
                    switch (i2) {
                        case 28:
                            textView.setSingleLine(attributeSet.getAttributeBooleanValue(i, false));
                            break;
                        case 29:
                            textView.setLines(attributeSet.getAttributeIntValue(i, 1));
                            break;
                        case 30:
                            String attributeValue6 = attributeSet.getAttributeValue(i);
                            String strSubstring2 = "";
                            if (attributeValue6.startsWith("@drawable/")) {
                                strSubstring2 = attributeValue6.substring(10);
                            }
                            if (!TextUtils.isEmpty(strSubstring2)) {
                                textView.setCompoundDrawables(textView.getResources().getDrawable(C13203i0.m37707a(C13008c.m36588n().m36542d(), strSubstring2, "drawable")), null, null, null);
                            }
                            break;
                        case 31:
                            textView.setCompoundDrawablePadding(C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i)));
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
    private static void m36389a(ImageView imageView, EnumC12973c enumC12973c, AttributeSet attributeSet, int i) {
        try {
            int i2 = a.f35376a[enumC12973c.ordinal()];
            if (i2 == 32) {
                C12972b.m36361a().m36366a(attributeSet.getAttributeValue(i), imageView);
                return;
            }
            if (i2 != 33) {
                return;
            }
            String attributeValue = attributeSet.getAttributeValue(i);
            if (TextUtils.isEmpty(attributeValue)) {
                return;
            }
            if (attributeValue.equals("fitXY")) {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                return;
            }
            if (attributeValue.equals("centerInside")) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            } else if (attributeValue.equals("centerCrop")) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else if (attributeValue.equals("fitStart")) {
                imageView.setScaleType(ImageView.ScaleType.FIT_START);
            }
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m36391a(ListView listView, EnumC12973c enumC12973c, AttributeSet attributeSet, int i) {
        try {
            int i2 = a.f35376a[enumC12973c.ordinal()];
            if (i2 == 25) {
                listView.setMotionEventSplittingEnabled(!attributeSet.getAttributeValue(i).equals("false"));
                return;
            }
            if (i2 != 26) {
                switch (i2) {
                    case 34:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue) && attributeValue.startsWith("@null")) {
                            listView.setDivider(null);
                            break;
                        }
                        break;
                    case 35:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue2)) {
                            if (attributeValue2.equals("none")) {
                                listView.setVerticalScrollBarEnabled(false);
                            }
                            if (attributeValue2.equals("false")) {
                                listView.setScrollbarFadingEnabled(false);
                            }
                        }
                        break;
                    case 36:
                        String attributeValue3 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            listView.setSelector(C12972b.m36361a().m36371d(attributeValue3));
                        }
                        break;
                }
                return;
            }
            listView.setCacheColorHint(C12972b.m36361a().m36371d(attributeSet.getAttributeValue(i)));
        } catch (Exception e) {
            C13219q0.m37816b("AttributeUtil", e.getMessage());
        }
    }
}
