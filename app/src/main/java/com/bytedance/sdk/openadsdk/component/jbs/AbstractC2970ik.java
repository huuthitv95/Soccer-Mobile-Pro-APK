package com.bytedance.sdk.openadsdk.component.jbs;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.widget.C3335bu;
import com.bytedance.sdk.openadsdk.core.widget.C3339ik;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.slm;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.jbs.ik */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2970ik extends com.bytedance.sdk.openadsdk.core.p217di.xha {

    /* JADX INFO: renamed from: co */
    C3339ik f9008co;

    /* JADX INFO: renamed from: di */
    C3335bu f9009di;

    /* JADX INFO: renamed from: fi */
    C3195mj f9010fi;

    /* JADX INFO: renamed from: ik */
    C3193ka f9011ik;
    C3335bu jbs;

    /* JADX INFO: renamed from: ka */
    PAGLogoView f9012ka;

    /* JADX INFO: renamed from: lr */
    C3192ik f9013lr;

    /* JADX INFO: renamed from: mj */
    final xha f9014mj;

    /* JADX INFO: renamed from: qt */
    C3195mj f9015qt;

    /* JADX INFO: renamed from: ri */
    C3193ka f9016ri;

    /* JADX INFO: renamed from: sf */
    C3195mj f9017sf;
    C3195mj xha;

    public AbstractC2970ik(Context context) {
        super(context);
        this.f9014mj = new xha(context);
    }

    public abstract C3193ka getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.f9012ka;
    }

    public abstract C3195mj getAdTitleTextView();

    public C3193ka getBackImage() {
        return this.f9016ri;
    }

    public C3195mj getClickButton() {
        return this.f9010fi;
    }

    public C3195mj getContent() {
        return this.f9017sf;
    }

    public C3339ik getDspAdChoice() {
        return this.f9008co;
    }

    public C3335bu getHostAppIcon() {
        return this.f9009di;
    }

    public C3195mj getHostAppName() {
        return this.xha;
    }

    public C3335bu getIconOnlyView() {
        return this.jbs;
    }

    public C3193ka getImageView() {
        return this.f9011ik;
    }

    public C3191fi getOverlayLayout() {
        return null;
    }

    public abstract slm getScoreBar();

    public C3195mj getTitle() {
        return this.f9015qt;
    }

    public C3195mj getTopCountDown() {
        xha xhaVar = this.f9014mj;
        if (xhaVar != null) {
            return xhaVar.getTopCountDown();
        }
        return null;
    }

    public View getTopDisLike() {
        xha xhaVar = this.f9014mj;
        if (xhaVar != null) {
            return xhaVar.getTopDislike();
        }
        return null;
    }

    public C3193ka getTopSkip() {
        xha xhaVar = this.f9014mj;
        if (xhaVar != null) {
            return xhaVar.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public C3192ik getVideoContainer() {
        return this.f9013lr;
    }
}
