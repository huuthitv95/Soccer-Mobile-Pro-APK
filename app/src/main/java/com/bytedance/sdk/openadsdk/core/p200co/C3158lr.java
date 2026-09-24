package com.bytedance.sdk.openadsdk.core.p200co;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.jbs.p095di.C2271ri;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import com.bytedance.adsdk.ugeno.xha.C2348ri;
import com.google.common.base.Ascii;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3158lr {

    /* JADX INFO: renamed from: ac */
    private boolean f10396ac;

    /* JADX INFO: renamed from: aw */
    private int f10397aw;
    private boolean bgr;

    /* JADX INFO: renamed from: bu */
    private float f10398bu;

    /* JADX INFO: renamed from: co */
    private float f10399co;

    /* JADX INFO: renamed from: fi */
    private int f10401fi;
    private int jbs;

    /* JADX INFO: renamed from: nr */
    private float f10406nr;

    /* JADX INFO: renamed from: qt */
    private TextUtils.TruncateAt f10407qt;

    /* JADX INFO: renamed from: ri */
    protected String f10408ri;

    /* JADX INFO: renamed from: sf */
    private float f10409sf;
    private float slm;
    private Context tan;

    /* JADX INFO: renamed from: vr */
    private float f10410vr;
    private int xha;

    /* JADX INFO: renamed from: lr */
    protected int f10404lr = ViewCompat.MEASURED_STATE_MASK;

    /* JADX INFO: renamed from: ik */
    private float f10402ik = 12.0f;

    /* JADX INFO: renamed from: ka */
    private float f10403ka = -1.0f;

    /* JADX INFO: renamed from: di */
    private int f10400di = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: mj */
    private int f10405mj = GravityCompat.START;

    public C3158lr(Context context, boolean z) {
        this.tan = context;
        this.f10396ac = z;
    }

    /* JADX INFO: renamed from: ik */
    private TextUtils.TruncateAt m13189ik(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    /* JADX INFO: renamed from: ik */
    private void m13190ik(C2271ri c2271ri) {
        float f = this.f10409sf;
        if (f <= 3.0f) {
            c2271ri.setLineSpacing(0.0f, f);
        } else if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(C2347mj.m8043ri(this.tan, (this.f10409sf - (this.f10402ik * 1.2f)) / 2.0f));
            c2271ri.setPadding(c2271ri.getPaddingLeft(), c2271ri.getPaddingTop() + iRound, c2271ri.getPaddingRight(), c2271ri.getPaddingBottom() + iRound);
            c2271ri.setLineHeight(Math.round(C2347mj.m8043ri(this.tan, this.f10409sf)));
        }
    }

    /* JADX INFO: renamed from: ka */
    private int m13191ka(String str) {
        str.hashCode();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ka */
    private void m13192ka(C2271ri c2271ri) {
        if (!this.f10396ac) {
            c2271ri.setShadowLayer(this.f10398bu, this.f10410vr, this.slm, this.f10397aw);
        } else if (this.bgr) {
            float f = this.f10398bu;
            if (f <= 0.0f) {
                f = 1.0E-5f;
            }
            c2271ri.setShadowLayer(f, this.f10410vr, this.slm, this.f10397aw);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX INFO: renamed from: lr */
    private int m13193lr(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1178781136) {
            if (iHashCode != -1039745817) {
                if (iHashCode == 3029637 && str.equals("bold")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals(Constants.NORMAL)) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals("italic")) {
            b = 1;
        } else {
            b = -1;
        }
        if (b != 0) {
            return b != 1 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: lr */
    private void m13194lr(C2271ri c2271ri) {
        c2271ri.setLineSpacing(0.0f, this.f10409sf);
    }

    /* JADX INFO: renamed from: ri */
    private int m13195ri(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                return 17;
            case "center_vertical":
                return 16;
            case "left":
                return 3;
            case "right":
                return 5;
            case "center_horizontal":
                return 1;
            default:
                return 3;
        }
    }

    /* JADX INFO: renamed from: ri */
    private Typeface m13196ri(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Typeface.create(Typeface.DEFAULT, i, false);
        }
        return i >= 700 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
    }

    /* JADX INFO: renamed from: ri */
    public void m13197ri(C2271ri c2271ri) {
        if (c2271ri == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f10408ri)) {
            c2271ri.setText(TextUtils.equals(AbstractJsonLexerKt.NULL, this.f10408ri) ? "" : this.f10408ri);
        }
        c2271ri.setTextSize(1, this.f10402ik);
        c2271ri.setMinTextSize(C2347mj.m8043ri(this.tan, this.f10403ka));
        c2271ri.setTextColor(this.f10404lr);
        c2271ri.setGravity(this.f10405mj);
        c2271ri.setLines(this.xha);
        c2271ri.setMaxLines(this.f10400di);
        int i = this.jbs;
        if (i != Integer.MAX_VALUE) {
            c2271ri.setPaintFlags(i);
        }
        c2271ri.setEllipsize(this.f10407qt);
        if (this.f10409sf > 0.0f) {
            if (this.f10396ac) {
                m13190ik(c2271ri);
            } else {
                m13194lr(c2271ri);
            }
        }
        c2271ri.setTypeface(m13196ri((int) this.f10399co));
        m13192ka(c2271ri);
        float fM8043ri = C2347mj.m8043ri(this.tan, this.f10402ik);
        if (fM8043ri > 0.0f) {
            c2271ri.setLetterSpacing(this.f10406nr / fM8043ri);
        }
        c2271ri.setIncludeFontPadding(false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ri */
    public void m13198ri(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -1589741021:
                if (str.equals("shadowColor")) {
                    b = 0;
                }
                break;
            case -1230714651:
                if (str.equals("shadowOffsetX")) {
                    b = 1;
                }
                break;
            case -1230714650:
                if (str.equals("shadowOffsetY")) {
                    b = 2;
                }
                break;
            case -1065511464:
                if (str.equals("textAlign")) {
                    b = 3;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b = 4;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    b = 5;
                }
                break;
            case -1021145689:
                if (str.equals("shadowBlur")) {
                    b = 6;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    b = 7;
                }
                break;
            case -879295043:
                if (str.equals("textDecoration")) {
                    b = 8;
                }
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
                    b = 9;
                }
                break;
            case -515807685:
                if (str.equals("lineHeight")) {
                    b = 10;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    b = Ascii.f22503VT;
                }
                break;
            case 102977279:
                if (str.equals("lines")) {
                    b = Ascii.f22492FF;
                }
                break;
            case 188702929:
                if (str.equals("ellipsis")) {
                    b = Ascii.f22490CR;
                }
                break;
            case 351195968:
                if (str.equals("minTextSize")) {
                    b = Ascii.f22500SO;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    b = Ascii.f22499SI;
                }
                break;
            case 2111078717:
                if (str.equals("letterSpacing")) {
                    b = Ascii.DLE;
                }
                break;
        }
        switch (b) {
            case 0:
                this.f10397aw = C2348ri.m8053ri(str2);
                this.bgr = true;
                break;
            case 1:
                this.f10410vr = C2347mj.m8043ri(this.tan, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 2:
                this.slm = C2347mj.m8043ri(this.tan, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 3:
                this.f10405mj = m13195ri(str2);
                break;
            case 4:
                this.f10404lr = C2348ri.m8053ri(str2);
                break;
            case 5:
                this.f10401fi = m13193lr(str2);
                break;
            case 6:
                this.f10398bu = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 7:
                this.f10402ik = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 8:
                this.jbs = m13191ka(str2);
                break;
            case 9:
                float fM8029ri = C2343ik.m8029ri(str2, -1.0f);
                this.f10399co = fM8029ri;
                if (fM8029ri < 1.0f || fM8029ri > 1000.0f) {
                    this.f10399co = 400.0f;
                }
                break;
            case 10:
                this.f10409sf = C2343ik.m8029ri(str2, 1.0f);
                break;
            case 11:
                this.f10408ri = str2;
                break;
            case 12:
                this.xha = C2343ik.m8030ri(str2, 0);
                break;
            case 13:
                this.f10407qt = m13189ik(str2);
                break;
            case 14:
                this.f10403ka = C2343ik.m8029ri(str2, -1.0f);
                break;
            case 15:
                int iM8030ri = C2343ik.m8030ri(str2, Integer.MAX_VALUE);
                this.f10400di = iM8030ri > 0 ? iM8030ri : Integer.MAX_VALUE;
                break;
            case 16:
                this.f10406nr = C2347mj.m8043ri(this.tan, C2343ik.m8029ri(str2, 0.0f));
                break;
        }
    }
}
