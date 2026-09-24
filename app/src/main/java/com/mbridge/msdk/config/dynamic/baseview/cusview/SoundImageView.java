package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.config.dynamic.utils.C12904f;
import com.mbridge.msdk.foundation.tools.C13203i0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class SoundImageView extends ComponentImageView {

    /* JADX INFO: renamed from: c */
    private boolean f34594c;

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34594c = true;
        setSoundStatus(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m35947a(View view) {
        boolean z = this.f34594c;
        setSoundStatus(!z);
        HashMap map = new HashMap();
        map.put("soundStatus", !z ? "0" : "1");
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        C12904f.m36164a(this.xmlView, view.getTag(), map);
    }

    public boolean getStatus() {
        return this.f34594c;
    }

    public void setSoundStatus(boolean z) {
        this.f34594c = z;
        if (z) {
            setImageResource(C13203i0.m37707a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(C13203i0.m37707a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentImageView
    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.cusview.SoundImageView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m35947a(view);
            }
        });
    }
}
