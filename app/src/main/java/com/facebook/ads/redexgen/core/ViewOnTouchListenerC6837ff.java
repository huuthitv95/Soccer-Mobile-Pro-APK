package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ff */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC6837ff implements View.OnTouchListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC5074Cz A00;

    public ViewOnTouchListenerC6837ff(TextureViewSurfaceTextureListenerC5074Cz textureViewSurfaceTextureListenerC5074Cz) {
        this.A00 = textureViewSurfaceTextureListenerC5074Cz;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A00.A09 != null && motionEvent.getAction() == 1) {
            if (this.A00.A09.isShowing()) {
                this.A00.A09.hide();
            } else {
                this.A00.A09.show();
            }
        }
        return true;
    }
}
