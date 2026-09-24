package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.C13203i0;

/* JADX INFO: loaded from: classes5.dex */
public class SoundImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    private boolean f35088a;

    public SoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35088a = true;
    }

    public boolean getStatus() {
        return this.f35088a;
    }

    public void setSoundStatus(boolean z) {
        this.f35088a = z;
        if (z) {
            setImageResource(C13203i0.m37707a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(C13203i0.m37707a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35088a = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.f35088a = true;
    }
}
