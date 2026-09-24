package com.fyber.inneractive.sdk.flow.endcard;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.player.p277ui.C8878b;
import com.fyber.inneractive.sdk.player.p277ui.InterfaceC8890n;
import com.fyber.inneractive.sdk.util.AbstractC9158i1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8088f extends AbstractC8083a {

    /* JADX INFO: renamed from: c */
    public final ViewGroup f17993c;

    /* JADX INFO: renamed from: d */
    public final Button f17994d;

    /* JADX INFO: renamed from: e */
    public final TextView f17995e;

    public C8088f(AbstractC8084b abstractC8084b) {
        super(abstractC8084b);
        View viewInflate = LayoutInflater.from(IAConfigManager.f17654M.f17689u.m20436a()).inflate(C7809R.layout.ia_layout_default_video_end_card, (ViewGroup) null);
        this.f17994d = (Button) viewInflate.findViewById(C7809R.id.ia_b_end_card_call_to_action);
        this.f17995e = (TextView) viewInflate.findViewById(C7809R.id.ia_endcard_tv_app_info_button);
        this.f17993c = AbstractC8083a.m20498a(viewInflate);
    }

    /* JADX INFO: renamed from: a */
    public final void m20522a(C8878b c8878b, InterfaceC8890n interfaceC8890n) {
        EnumC8253m enumC8253m;
        Context context = this.f17994d.getContext();
        this.f17994d.setAllCaps(c8878b.f20857b);
        this.f17994d.setVisibility(0);
        if (IAConfigManager.f17654M.f17660D.m20650n() && (enumC8253m = c8878b.f20864i) != null && enumC8253m == EnumC8253m.TRUE_SINGLE_TAP) {
            this.f17994d.setText(C7809R.string.ia_video_instant_install_text);
            if (c8878b.f20862g) {
                String str = c8878b.f20863h;
                if (str != null && str.length() == 1) {
                    TextView textView = this.f17995e;
                    int dimensionPixelSize = textView.getContext().getResources().getDimensionPixelSize(C7809R.dimen.ia_image_control_size);
                    textView.setBackgroundResource(C7809R.drawable.ia_bg_circle_overlay);
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    layoutParams.width = dimensionPixelSize;
                    layoutParams.height = dimensionPixelSize;
                    textView.setLayoutParams(layoutParams);
                }
                this.f17995e.setText(str);
                this.f17995e.setVisibility(0);
            }
        } else {
            this.f17995e.setVisibility(8);
            Button button = this.f17994d;
            Context context2 = this.f17993c.getContext();
            String str2 = c8878b.f20858c;
            button.setText(!TextUtils.isEmpty(str2) ? AbstractC9158i1.m21971a(str2, 15) : context2.getString(C7809R.string.ia_video_install_now_text));
        }
        this.f17994d.setBackgroundResource(C7809R.drawable.ia_bg_green);
        this.f17994d.setTextSize(0, context.getResources().getDimension(C7809R.dimen.ia_video_overlay_text_large_plus));
        TextView textView2 = this.f17995e;
        if (interfaceC8890n != null) {
            textView2.setOnTouchListener(new ViewOnTouchListenerC8087e(10, interfaceC8890n));
        } else {
            textView2.setOnTouchListener(null);
        }
        Button button2 = this.f17994d;
        if (interfaceC8890n != null) {
            button2.setOnTouchListener(new ViewOnTouchListenerC8087e(8, interfaceC8890n));
        } else {
            button2.setOnTouchListener(null);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.InterfaceC8108n
    /* JADX INFO: renamed from: b */
    public final View mo20506b() {
        return this.f17993c;
    }
}
