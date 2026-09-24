package com.bytedance.adsdk.ugeno.jbs.p095di;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import com.bytedance.adsdk.ugeno.xha.C2348ri;
import com.google.common.base.Ascii;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.di.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2270lr extends AbstractViewOnTouchListenerC2318ik<C2271ri> {

    @Deprecated
    private TextUtils.TruncateAt adz;
    protected int akr;
    private float amj;
    private float bfa;
    private boolean bzf;

    /* JADX INFO: renamed from: de */
    private float f5698de;
    private float eqw;

    /* JADX INFO: renamed from: eu */
    private int f5699eu;
    private float evm;
    private TextUtils.TruncateAt ezp;

    /* JADX INFO: renamed from: fb */
    private int f5700fb;

    /* JADX INFO: renamed from: fn */
    private float f5701fn;

    /* JADX INFO: renamed from: jm */
    private int f5702jm;

    @Deprecated
    private float rbz;

    /* JADX INFO: renamed from: ri */
    protected String f5703ri;

    @Deprecated
    private float smj;

    /* JADX INFO: renamed from: sz */
    private float f5704sz;
    private int tpb;
    private int xlq;

    /* JADX INFO: renamed from: zv */
    private float f5705zv;
    private int zxp;

    public C2270lr(Context context) {
        super(context);
        this.akr = ViewCompat.MEASURED_STATE_MASK;
        this.f5698de = 12.0f;
        this.f5705zv = -1.0f;
        this.zxp = Integer.MAX_VALUE;
        this.tpb = GravityCompat.START;
        this.ezp = TextUtils.TruncateAt.END;
        this.evm = -1.0f;
        this.f5704sz = 400.0f;
    }

    private TextUtils.TruncateAt bgr(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                this.adz = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.adz = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.adz = TextUtils.TruncateAt.START;
                break;
            default:
                this.adz = null;
                break;
        }
        return this.adz;
    }

    /* JADX INFO: renamed from: bu */
    private int m7664bu(String str) {
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

    private void jbs() {
        if (this.evm <= 3.0f) {
            ((C2271ri) this.f5875fi).setLineSpacing(0.0f, this.evm);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(C2347mj.m8043ri(this.f5888lr, (this.evm - (this.f5698de * 1.2f)) / 2.0f));
            ((C2271ri) this.f5875fi).setPadding(((C2271ri) this.f5875fi).getPaddingLeft(), ((C2271ri) this.f5875fi).getPaddingTop() + iRound, ((C2271ri) this.f5875fi).getPaddingRight(), ((C2271ri) this.f5875fi).getPaddingBottom() + iRound);
            ((C2271ri) this.f5875fi).setLineHeight(Math.round(C2347mj.m8043ri(this.f5888lr, this.evm)));
        }
    }

    /* JADX INFO: renamed from: ka */
    private void m7665ka() {
        ((C2271ri) this.f5875fi).setLineSpacing(0.0f, this.evm);
    }

    /* JADX INFO: renamed from: nr */
    private int m7666nr(String str) {
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

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    private int slm(String str) {
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

    /* JADX INFO: renamed from: vr */
    private TextUtils.TruncateAt m7667vr(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    /* JADX INFO: renamed from: aw */
    public void mo7668aw(String str) {
        this.f5703ri = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(AbstractJsonLexerKt.NULL, str)) {
            this.f5703ri = "";
        }
        ((C2271ri) this.f5875fi).setText(this.f5703ri);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public C2271ri mo7552ri() {
        C2271ri c2271ri = new C2271ri(this.f5888lr);
        c2271ri.m7674ri(this);
        return c2271ri;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
        if (TextUtils.equals(AbstractJsonLexerKt.NULL, this.f5703ri)) {
            this.f5703ri = "";
        }
        mo7668aw(this.f5703ri);
        ((C2271ri) this.f5875fi).setTextSize(1, this.f5698de);
        ((C2271ri) this.f5875fi).setTextColor(this.akr);
        ((C2271ri) this.f5875fi).setLines(this.f5699eu);
        ((C2271ri) this.f5875fi).setMaxLines(this.zxp);
        ((C2271ri) this.f5875fi).setGravity(this.tpb);
        ((C2271ri) this.f5875fi).setIncludeFontPadding(false);
        ((C2271ri) this.f5875fi).setMinTextSize(C2347mj.m8043ri(this.f5888lr, this.f5705zv));
        m7670ri(this.f5702jm);
        if (hcw()) {
            m7671ri(this.ezp);
        } else {
            m7671ri(this.adz);
        }
        if (this.evm > 0.0f) {
            if (hcw()) {
                jbs();
            } else {
                m7665ka();
            }
        }
        ((C2271ri) this.f5875fi).setBreakStrategy(0);
        if (!hcw()) {
            ((C2271ri) this.f5875fi).setShadowLayer(this.bfa, this.smj, this.rbz, this.f5700fb);
        } else if (this.bzf) {
            if (this.bfa <= 0.0f) {
                this.bfa = 1.0E-5f;
            }
            ((C2271ri) this.f5875fi).setShadowLayer(this.bfa, this.eqw, this.amj, this.f5700fb);
        }
        if (this.xlq == 1) {
            ((C2271ri) this.f5875fi).setTypeface(Typeface.DEFAULT, this.xlq);
        } else if (Build.VERSION.SDK_INT >= 28) {
            ((C2271ri) this.f5875fi).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.f5704sz, this.xlq == 2));
        } else if (this.f5704sz >= 500.0f) {
            ((C2271ri) this.f5875fi).setTypeface(Typeface.DEFAULT, 1);
        }
        if (C2347mj.m8043ri(this.f5888lr, this.f5698de) > 0.0f) {
            ((C2271ri) this.f5875fi).setLetterSpacing(this.f5701fn / C2347mj.m8043ri(this.f5888lr, this.f5698de));
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7670ri(int i) {
        this.f5702jm = i;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        ((C2271ri) this.f5875fi).setPaintFlags(i);
    }

    /* JADX INFO: renamed from: ri */
    public void m7671ri(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((C2271ri) this.f5875fi).setEllipsize(truncateAt);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public void mo7553ri(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.mo7553ri(str, str2);
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -1621067310:
                if (str.equals("shadowRadius")) {
                    b = 0;
                }
                break;
            case -1589741021:
                if (str.equals("shadowColor")) {
                    b = 1;
                }
                break;
            case -1230714651:
                if (str.equals("shadowOffsetX")) {
                    b = 2;
                }
                break;
            case -1230714650:
                if (str.equals("shadowOffsetY")) {
                    b = 3;
                }
                break;
            case -1065511464:
                if (str.equals("textAlign")) {
                    b = 4;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b = 5;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    b = 6;
                }
                break;
            case -1021145689:
                if (str.equals("shadowBlur")) {
                    b = 7;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    b = 8;
                }
                break;
            case -879295043:
                if (str.equals("textDecoration")) {
                    b = 9;
                }
                break;
            case -756368940:
                if (str.equals("shadowDx")) {
                    b = 10;
                }
                break;
            case -756368939:
                if (str.equals("shadowDy")) {
                    b = Ascii.f22503VT;
                }
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
                    b = Ascii.f22492FF;
                }
                break;
            case -515807685:
                if (str.equals("lineHeight")) {
                    b = Ascii.f22490CR;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    b = Ascii.f22500SO;
                }
                break;
            case 102977279:
                if (str.equals("lines")) {
                    b = Ascii.f22499SI;
                }
                break;
            case 188702929:
                if (str.equals("ellipsis")) {
                    b = Ascii.DLE;
                }
                break;
            case 351195968:
                if (str.equals("minTextSize")) {
                    b = 17;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    b = Ascii.DC2;
                }
                break;
            case 1554823821:
                if (str.equals("ellipsize")) {
                    b = 19;
                }
                break;
            case 2111078717:
                if (str.equals("letterSpacing")) {
                    b = Ascii.DC4;
                }
                break;
        }
        switch (b) {
            case 0:
            case 7:
                this.bfa = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 1:
                this.f5700fb = C2348ri.m8053ri(str2);
                this.bzf = true;
                break;
            case 2:
                this.eqw = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 3:
                this.amj = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 4:
                this.tpb = m7664bu(str2);
                break;
            case 5:
                this.akr = C2348ri.m8053ri(str2);
                break;
            case 6:
                this.xlq = slm(str2);
                break;
            case 8:
                this.f5698de = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 9:
                this.f5702jm = m7666nr(str2);
                break;
            case 10:
                this.smj = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 11:
                this.rbz = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 12:
                float fM8029ri = C2343ik.m8029ri(str2, -1.0f);
                this.f5704sz = fM8029ri;
                if (fM8029ri < 1.0f || fM8029ri > 1000.0f) {
                    this.f5704sz = 400.0f;
                }
                break;
            case 13:
                this.evm = C2343ik.m8029ri(str2, 1.0f);
                break;
            case 14:
                this.f5703ri = str2;
                break;
            case 15:
                this.f5699eu = C2343ik.m8030ri(str2, 0);
                break;
            case 16:
                this.ezp = m7667vr(str2);
                break;
            case 17:
                this.f5705zv = C2343ik.m8029ri(str2, -1.0f);
                break;
            case 18:
                int iM8030ri = C2343ik.m8030ri(str2, Integer.MAX_VALUE);
                this.zxp = iM8030ri > 0 ? iM8030ri : Integer.MAX_VALUE;
                break;
            case 19:
                this.adz = bgr(str2);
                break;
            case 20:
                this.f5701fn = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                break;
        }
    }
}
