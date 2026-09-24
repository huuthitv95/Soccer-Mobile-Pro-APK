package com.mbridge.msdk.config.dynamic;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.view.GravityCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.common.base.Ascii;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.config.dynamic.utils.EnumC12901c;
import com.mbridge.msdk.dycreator.utils.C12982e;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.c */
/* JADX INFO: compiled from: ComponentResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12898c {

    /* JADX INFO: renamed from: d */
    private static volatile C12898c f34703d;

    /* JADX INFO: renamed from: a */
    private SoftReference<HashMap<String, EnumC12901c>> f34704a;

    /* JADX INFO: renamed from: b */
    private Context f34705b = C13008c.m36588n().m36542d();

    /* JADX INFO: renamed from: c */
    private HashMap<String, EnumC12901c> f34706c;

    private C12898c() {
        m36067d();
    }

    /* JADX INFO: renamed from: a */
    public static C12898c m36066a() {
        if (f34703d == null) {
            synchronized (C12898c.class) {
                if (f34703d == null) {
                    f34703d = new C12898c();
                }
            }
        }
        return f34703d;
    }

    /* JADX INFO: renamed from: b */
    public HashMap m36072b() {
        SoftReference<HashMap<String, EnumC12901c>> softReference = this.f34704a;
        if (softReference == null || softReference.get() == null) {
            HashMap map = new HashMap(45);
            map.put("layout_width", EnumC12901c.layout_width);
            map.put("layout_height", EnumC12901c.layout_height);
            map.put("orientation", EnumC12901c.orientation);
            map.put("layout_centerHorizontal", EnumC12901c.layout_centerHorizontal);
            map.put("layout_centerVertical", EnumC12901c.layout_centerVertical);
            map.put("layout_marginLeft", EnumC12901c.layout_marginLeft);
            map.put("layout_marginRight", EnumC12901c.layout_marginRight);
            map.put("layout_margin", EnumC12901c.layout_margin);
            map.put("layout_gravity", EnumC12901c.layout_gravity);
            map.put("layout_alignParentRight", EnumC12901c.layout_alignParentRight);
            map.put("layout_weight", EnumC12901c.layout_weight);
            map.put("contentDescription", EnumC12901c.contentDescription);
            map.put("gravity", EnumC12901c.gravity);
            map.put("id", EnumC12901c.id);
            map.put("layout_below", EnumC12901c.layout_below);
            map.put("layout_above", EnumC12901c.layout_above);
            map.put("layout_toLeftOf", EnumC12901c.layout_toLeftOf);
            map.put("layout_toRightOf", EnumC12901c.layout_toRightOf);
            map.put("layout_toEndOf", EnumC12901c.layout_toEndOf);
            map.put("background", EnumC12901c.background);
            map.put("layout_marginTop", EnumC12901c.layout_marginTop);
            map.put("layout_marginBottom", EnumC12901c.layout_marginBottom);
            map.put("layout_marginStart", EnumC12901c.layout_marginStart);
            map.put("layout_marginEnd", EnumC12901c.layout_marginEnd);
            map.put("layout_alignParentBottom", EnumC12901c.layout_alignParentBottom);
            map.put("layout_alignParentTop", EnumC12901c.layout_alignParentTop);
            map.put("layout_alignParentLeft", EnumC12901c.layout_alignParentLeft);
            map.put("layout_alignWithParentIfMissing", EnumC12901c.layout_alignWithParentIfMissing);
            map.put("layout_alignTop", EnumC12901c.layout_alignTop);
            map.put("layout_alignBottom", EnumC12901c.layout_alignBottom);
            map.put("layout_alignLeft", EnumC12901c.layout_alignLeft);
            map.put("layout_alignRight", EnumC12901c.layout_alignRight);
            map.put("layout_centerInParent", EnumC12901c.layout_centerInParent);
            map.put("layout_alignParentEnd", EnumC12901c.layout_alignParentEnd);
            this.f34704a = new SoftReference<>(map);
        }
        return this.f34704a.get();
    }

    /* JADX INFO: renamed from: c */
    public HashMap<String, EnumC12901c> m36074c() {
        return this.f34706c;
    }

    /* JADX INFO: renamed from: d */
    public int m36075d(String str) {
        if (this.f34705b == null) {
            return 0;
        }
        String strM36550i = C13008c.m36588n().m36550i();
        if (TextUtils.isEmpty(strM36550i)) {
            strM36550i = this.f34705b.getPackageName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strM36550i);
        sb.append(".R$");
        String[] strArrSplit = str.split("\\.");
        sb.append(strArrSplit[1]);
        try {
            Class<?> cls = Class.forName(sb.toString());
            Object objNewInstance = cls.newInstance();
            Field declaredField = cls.getDeclaredField(strArrSplit[2]);
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(objNewInstance)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m36076e(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith("#")) {
                return Color.parseColor(str);
            }
            return 0;
        } catch (Exception e) {
            C13219q0.m37816b("ComponentResource", e.getMessage());
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public int m36073c(String str) {
        byte b;
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            int i = 0;
            for (String str2 : str.split("\\|")) {
                String lowerCase = str2.toLowerCase();
                int i2 = 7;
                switch (lowerCase.hashCode()) {
                    case -1633016142:
                        if (lowerCase.equals("fill_vertical")) {
                            b = Ascii.f22503VT;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1383228885:
                        if (lowerCase.equals("bottom")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1364013995:
                        if (lowerCase.equals("center")) {
                            b = 4;
                        } else {
                            b = -1;
                        }
                        break;
                    case -483365792:
                        if (lowerCase.equals("fill_horizontal")) {
                            b = 10;
                        } else {
                            b = -1;
                        }
                        break;
                    case -348726240:
                        if (lowerCase.equals("center_vertical")) {
                            b = 6;
                        } else {
                            b = -1;
                        }
                        break;
                    case 100571:
                        if (lowerCase.equals("end")) {
                            b = 8;
                        } else {
                            b = -1;
                        }
                        break;
                    case 115029:
                        if (lowerCase.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3143043:
                        if (lowerCase.equals("fill")) {
                            b = 9;
                        } else {
                            b = -1;
                        }
                        break;
                    case 3317767:
                        if (lowerCase.equals("left")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        break;
                    case 108511772:
                        if (lowerCase.equals("right")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                        break;
                    case 109757538:
                        if (lowerCase.equals("start")) {
                            b = 7;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1063616078:
                        if (lowerCase.equals("center_horizontal")) {
                            b = 5;
                        } else {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        i2 = 48;
                        break;
                    case 1:
                        i2 = 80;
                        break;
                    case 2:
                        i2 = 3;
                        break;
                    case 3:
                        i2 = 5;
                        break;
                    case 4:
                        i2 = 17;
                        break;
                    case 5:
                        i2 = 1;
                        break;
                    case 6:
                        i2 = 16;
                        break;
                    case 7:
                        i2 = GravityCompat.START;
                        break;
                    case 8:
                        i2 = GravityCompat.END;
                        break;
                    case 9:
                        i2 = Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                        break;
                    case 10:
                        break;
                    case 11:
                        i2 = 112;
                        break;
                    default:
                        continue;
                        break;
                }
                i |= i2;
            }
            return i;
        } catch (Exception e) {
            C13219q0.m37816b("ComponentResource", e.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m36068a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            int iIndexOf = str.indexOf("d");
            int iIndexOf2 = str.indexOf(CmcdData.Factory.STREAMING_FORMAT_SS);
            if (iIndexOf == -1) {
                iIndexOf = iIndexOf2;
            }
            int i = Integer.parseInt(str.substring(0, iIndexOf));
            if (str.contains("d")) {
                return C12982e.m36410a(this.f34705b, i);
            }
            str.contains(CmcdData.Factory.STREAMING_FORMAT_SS);
            return i;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m36067d() {
        HashMap<String, EnumC12901c> map = new HashMap<>();
        this.f34706c = map;
        map.put("id", EnumC12901c.id);
        this.f34706c.put("background", EnumC12901c.background);
        this.f34706c.put("visibility", EnumC12901c.visibility);
        this.f34706c.put("contentDescription", EnumC12901c.contentDescription);
        this.f34706c.put("padding", EnumC12901c.padding);
        this.f34706c.put("paddingTop", EnumC12901c.paddingTop);
        this.f34706c.put("paddingBottom", EnumC12901c.paddingBottom);
        this.f34706c.put("paddingLeft", EnumC12901c.paddingLeft);
        this.f34706c.put("paddingRight", EnumC12901c.paddingRight);
        this.f34706c.put("paddingStart", EnumC12901c.paddingStart);
        this.f34706c.put("paddingEnd", EnumC12901c.paddingEnd);
        this.f34706c.put("layout_margin", EnumC12901c.layout_margin);
        this.f34706c.put("layout_marginTop", EnumC12901c.layout_marginTop);
        this.f34706c.put("layout_marginBottom", EnumC12901c.layout_marginBottom);
        this.f34706c.put("layout_marginLeft", EnumC12901c.layout_marginLeft);
        this.f34706c.put("layout_marginRight", EnumC12901c.layout_marginRight);
        this.f34706c.put("layout_marginStart", EnumC12901c.layout_marginStart);
        this.f34706c.put("layout_marginEnd", EnumC12901c.layout_marginEnd);
        this.f34706c.put("alpha", EnumC12901c.alpha);
        this.f34706c.put(Key.ROTATION, EnumC12901c.rotation);
        this.f34706c.put("scaleX", EnumC12901c.scaleX);
        this.f34706c.put("scaleY", EnumC12901c.scaleY);
        this.f34706c.put("translationX", EnumC12901c.translationX);
        this.f34706c.put("translationY", EnumC12901c.translationY);
        this.f34706c.put(ViewHierarchyConstants.TAG_KEY, EnumC12901c.tag);
        this.f34706c.put("text", EnumC12901c.text);
        this.f34706c.put("textColor", EnumC12901c.textColor);
        this.f34706c.put("textSize", EnumC12901c.textSize);
        this.f34706c.put("textStyle", EnumC12901c.textStyle);
        this.f34706c.put("maxLines", EnumC12901c.maxLines);
        this.f34706c.put("minLines", EnumC12901c.minLines);
        this.f34706c.put("lines", EnumC12901c.lines);
        this.f34706c.put("ellipsize", EnumC12901c.ellipsize);
        this.f34706c.put("gravity", EnumC12901c.gravity);
        this.f34706c.put("drawablePadding", EnumC12901c.drawablePadding);
        this.f34706c.put("drawableStart", EnumC12901c.drawableStart);
        this.f34706c.put("drawableEnd", EnumC12901c.drawableEnd);
        this.f34706c.put("drawableTop", EnumC12901c.drawableTop);
        this.f34706c.put("drawableBottom", EnumC12901c.drawableBottom);
        this.f34706c.put("singleLine", EnumC12901c.singleLine);
        this.f34706c.put("marqueeRepeatLimit", EnumC12901c.marqueeRepeatLimit);
        this.f34706c.put("includeFontPadding", EnumC12901c.includeFontPadding);
        this.f34706c.put("lineSpacingExtra", EnumC12901c.lineSpacingExtra);
        this.f34706c.put("lineSpacingMultiplier", EnumC12901c.lineSpacingMultiplier);
        this.f34706c.put(ViewHierarchyConstants.HINT_KEY, EnumC12901c.hint);
        this.f34706c.put("inputType", EnumC12901c.inputType);
        this.f34706c.put("maxLength", EnumC12901c.maxLength);
        this.f34706c.put("textIsSelectable", EnumC12901c.textIsSelectable);
        this.f34706c.put("cursorVisible", EnumC12901c.cursorVisible);
        this.f34706c.put("backgroundTint", EnumC12901c.backgroundTint);
        this.f34706c.put("allCaps", EnumC12901c.allCaps);
        this.f34706c.put("src", EnumC12901c.src);
        this.f34706c.put("scaleType", EnumC12901c.scaleType);
        this.f34706c.put("adjustViewBounds", EnumC12901c.adjustViewBounds);
        this.f34706c.put("maxWidth", EnumC12901c.maxWidth);
        this.f34706c.put("maxHeight", EnumC12901c.maxHeight);
        this.f34706c.put("tint", EnumC12901c.tint);
        this.f34706c.put("divider", EnumC12901c.divider);
        this.f34706c.put("dividerHeight", EnumC12901c.dividerHeight);
        this.f34706c.put("scrollbars", EnumC12901c.scrollbars);
        this.f34706c.put("listSelector", EnumC12901c.listSelector);
        this.f34706c.put("stackFromBottom", EnumC12901c.stackFromBottom);
        this.f34706c.put("transcriptMode", EnumC12901c.transcriptMode);
        this.f34706c.put("numColumns", EnumC12901c.numColumns);
        this.f34706c.put("verticalSpacing", EnumC12901c.verticalSpacing);
        this.f34706c.put("horizontalSpacing", EnumC12901c.horizontalSpacing);
        this.f34706c.put("stretchMode", EnumC12901c.stretchMode);
        this.f34706c.put("columnWidth", EnumC12901c.columnWidth);
        this.f34706c.put("fillViewport", EnumC12901c.fillViewport);
        this.f34706c.put("scrollbarStyle", EnumC12901c.scrollbarStyle);
        this.f34706c.put("orientation", EnumC12901c.orientation);
        this.f34706c.put("weightSum", EnumC12901c.weightSum);
        this.f34706c.put("baselineAligned", EnumC12901c.baselineAligned);
        this.f34706c.put("measureWithLargestChild", EnumC12901c.measureWithLargestChild);
        this.f34706c.put("ignoreGravity", EnumC12901c.ignoreGravity);
        this.f34706c.put("foreground", EnumC12901c.foreground);
        this.f34706c.put("foregroundGravity", EnumC12901c.foregroundGravity);
        this.f34706c.put("measureAllChildren", EnumC12901c.measureAllChildren);
        this.f34706c.put("style", EnumC12901c.style);
        this.f34706c.put("progress", EnumC12901c.progress);
        this.f34706c.put("max", EnumC12901c.max);
        this.f34706c.put("progressDrawable", EnumC12901c.progressDrawable);
    }

    /* JADX INFO: renamed from: a */
    public int m36069a(String str, String str2) {
        if (this.f34705b == null) {
            return 0;
        }
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            String strM36550i = C13008c.m36588n().m36550i();
            if (TextUtils.isEmpty(strM36550i)) {
                strM36550i = this.f34705b.getPackageName();
            }
            return contextM36542d.getResources().getIdentifier(str2, str, strM36550i);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public View m36070a(String str, ViewGroup viewGroup, C12894a c12894a) {
        if (this.f34705b != null) {
            try {
                return new C12862b(this.f34705b, c12894a).m35891a(str, viewGroup);
            } catch (Exception e) {
                C13219q0.m37816b("ComponentResource", e.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public int m36071b(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("@color/")) {
            return 0;
        }
        return this.f34705b.getResources().getColor(m36069a("color", str.substring(7)));
    }
}
