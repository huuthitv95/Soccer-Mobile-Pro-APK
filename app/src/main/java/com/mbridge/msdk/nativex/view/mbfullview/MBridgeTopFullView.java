package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.C13203i0;

/* JADX INFO: loaded from: classes6.dex */
public class MBridgeTopFullView extends BaseView {
    public static final String INTERFACE_RESULT = MBridgeTopFullView.class.getName() + "WithResault";

    /* JADX INFO: renamed from: j */
    protected ImageView f37359j;

    /* JADX INFO: renamed from: k */
    protected TextView f37360k;

    /* JADX INFO: renamed from: l */
    protected TextView f37361l;

    /* JADX INFO: renamed from: m */
    protected StarLevelLayoutView f37362m;

    public MBridgeTopFullView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(C13203i0.m37707a(getContext(), "mbridge_nativex_fullscreen_top", "layout"), this.f37355i);
        if (viewInflate != null) {
            this.f37359j = (ImageView) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_full_tv_display_icon", "id"));
            this.f37360k = (TextView) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_full_tv_display_title", "id"));
            this.f37361l = (TextView) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_full_tv_display_description", "id"));
            this.f37362m = (StarLevelLayoutView) viewInflate.findViewById(C13203i0.m37707a(getContext(), "mbridge_full_tv_feeds_star", "id"));
            this.f37361l.setTextColor(-7829368);
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            updateLayoutParams();
        }
    }

    public TextView getMBridgeFullViewDisplayDscription() {
        return this.f37361l;
    }

    public ImageView getMBridgeFullViewDisplayIcon() {
        return this.f37359j;
    }

    public TextView getMBridgeFullViewDisplayTitle() {
        return this.f37360k;
    }

    public StarLevelLayoutView getStarLevelLayoutView() {
        return this.f37362m;
    }

    public void updateLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        this.f37347a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        this.f37348b.setLayoutParams(layoutParams2);
    }
}
