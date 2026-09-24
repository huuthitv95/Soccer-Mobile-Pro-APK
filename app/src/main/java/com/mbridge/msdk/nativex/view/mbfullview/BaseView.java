package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.C13203i0;

/* JADX INFO: loaded from: classes6.dex */
public class BaseView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    protected RelativeLayout f37347a;

    /* JADX INFO: renamed from: b */
    protected RelativeLayout f37348b;

    /* JADX INFO: renamed from: c */
    protected RelativeLayout f37349c;

    /* JADX INFO: renamed from: d */
    protected ImageView f37350d;

    /* JADX INFO: renamed from: e */
    protected TextView f37351e;

    /* JADX INFO: renamed from: f */
    protected ProgressBar f37352f;

    /* JADX INFO: renamed from: g */
    protected FrameLayout f37353g;

    /* JADX INFO: renamed from: h */
    protected LinearLayout f37354h;

    /* JADX INFO: renamed from: i */
    protected RelativeLayout f37355i;
    public EnumC13435a style;

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.mbfullview.BaseView$a */
    public enum EnumC13435a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public BaseView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(C13203i0.m37707a(getContext(), "mbridge_nativex_fullbasescreen", "layout"), this);
        this.f37355i = (RelativeLayout) viewInflate;
        if (viewInflate != null) {
            this.f37347a = (RelativeLayout) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f37348b = (RelativeLayout) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_full_player_parent", "id"));
            this.f37349c = (RelativeLayout) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_full_rl_close", "id"));
            this.f37350d = (ImageView) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_full_iv_close", "id"));
            this.f37351e = (TextView) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_full_tv_install", "id"));
            this.f37352f = (ProgressBar) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f37353g = (FrameLayout) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_full_animation_content", "id"));
            this.f37354h = (LinearLayout) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_full_animation_player", "id"));
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f37349c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f37350d;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f37352f;
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f37347a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f37348b;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f37351e;
    }

    public EnumC13435a getStytle() {
        return this.style;
    }

    public FrameLayout getmAnimationContent() {
        return this.f37353g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f37354h;
    }

    public void setStytle(EnumC13435a enumC13435a) {
        this.style = enumC13435a;
    }
}
