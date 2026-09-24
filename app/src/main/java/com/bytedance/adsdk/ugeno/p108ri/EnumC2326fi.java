package com.bytedance.adsdk.ugeno.p108ri;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import com.google.common.base.Ascii;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2326fi {
    TRANSLATE("translate", "translation", "point"),
    TRANSLATE_X("translateX", "translationX", TypedValues.Custom.S_FLOAT),
    TRANSLATE_Y("translateY", "translationY", TypedValues.Custom.S_FLOAT),
    ROTATE_X("rotateX", "rotationX", TypedValues.Custom.S_FLOAT),
    ROTATE_Y("rotateY", "rotationY", TypedValues.Custom.S_FLOAT),
    ROTATE_Z("rotateZ", Key.ROTATION, TypedValues.Custom.S_FLOAT),
    SCALE("scale", "scale", "point"),
    SCALE_X("scaleX", "scaleX", TypedValues.Custom.S_FLOAT),
    SCALE_Y("scaleY", "scaleY", TypedValues.Custom.S_FLOAT),
    ALPHA("opacity", "alpha", TypedValues.Custom.S_FLOAT),
    BACKGROUND_COLOR("backgroundColor", "backgroundColor", "int"),
    BORDER_RADIUS("borderRadius", "borderRadius", TypedValues.Custom.S_FLOAT),
    RIPPLE("ripple", "ripple", TypedValues.Custom.S_FLOAT),
    SHINE("shine", "shine", TypedValues.Custom.S_FLOAT);


    /* JADX INFO: renamed from: bu */
    private final String f6021bu;
    private final String slm;

    /* JADX INFO: renamed from: vr */
    private final String f6022vr;

    EnumC2326fi(String str, String str2, String str3) {
        this.f6022vr = str;
        this.slm = str2;
        this.f6021bu = str3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ri */
    public static EnumC2326fi m7959ri(String str) {
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -1721943862:
                if (str.equals("translateX")) {
                    b = 0;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    b = 1;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b = 2;
                }
                break;
            case -930826704:
                if (str.equals("ripple")) {
                    b = 3;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b = 4;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b = 5;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    b = 6;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b = 7;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    b = 8;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b = 9;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    b = 10;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    b = Ascii.f22503VT;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    b = Ascii.f22492FF;
                }
                break;
        }
        switch (b) {
            case 0:
                return TRANSLATE_X;
            case 1:
                return TRANSLATE_Y;
            case 2:
                return ALPHA;
            case 3:
                return RIPPLE;
            case 4:
                return SCALE_X;
            case 5:
                return SCALE_Y;
            case 6:
                return SCALE;
            case 7:
                return TRANSLATE;
            case 8:
                return BACKGROUND_COLOR;
            case 9:
                return BORDER_RADIUS;
            case 10:
                return ROTATE_X;
            case 11:
                return ROTATE_Y;
            case 12:
                return ROTATE_Z;
            default:
                return TRANSLATE_X;
        }
    }

    /* JADX INFO: renamed from: ik */
    public String m7960ik() {
        return this.f6021bu;
    }

    /* JADX INFO: renamed from: lr */
    public String m7961lr() {
        return this.slm;
    }

    /* JADX INFO: renamed from: ri */
    public String m7962ri() {
        return this.f6022vr;
    }
}
