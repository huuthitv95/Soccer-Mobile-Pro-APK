package com.fyber.inneractive.sdk.player.controller;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.global.features.C7975c;
import com.fyber.inneractive.sdk.util.AbstractC9158i1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.f0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8464f0 {

    /* JADX INFO: renamed from: a */
    public final C8481v f18851a;

    /* JADX INFO: renamed from: b */
    public final Dialog f18852b;

    public C8464f0(Context context, C7975c c7975c, C8481v c8481v) {
        this.f18851a = c8481v;
        Dialog dialog = new Dialog(context);
        this.f18852b = dialog;
        dialog.requestWindowFeature(1);
        dialog.setContentView(C7809R.layout.ia_layout_skip_rewarded_dialog);
        Button button = (Button) dialog.findViewById(C7809R.id.ia_keep_watching_button);
        Button button2 = (Button) dialog.findViewById(C7809R.id.ia_close_button);
        TextView textView = (TextView) dialog.findViewById(C7809R.id.ia_skip_dialog_title_textview);
        TextView textView2 = (TextView) dialog.findViewById(C7809R.id.ia_skip_dialog_sub_title_textview);
        String string = context.getString(C7809R.string.ia_skip_rewarded_dialog_keep_watching);
        String string2 = context.getString(C7809R.string.ia_skip_rewarded_dialog_close_button);
        String string3 = context.getString(C7809R.string.ia_skip_rewarded_dialog_title);
        String string4 = context.getString(C7809R.string.ia_skip_rewarded_dialog_sub_title);
        if (c7975c != null) {
            String strMo20417a = c7975c.mo20417a("skip_reward_dialog_keep_watching_button", "KEEP WATCHING");
            String strTrim = strMo20417a.trim().length() > 0 ? strMo20417a.trim() : "KEEP WATCHING";
            string = TextUtils.isEmpty(strTrim) ? string : strTrim;
            String strMo20417a2 = c7975c.mo20417a("skip_reward_dialog_close_button", "CLOSE");
            String strTrim2 = strMo20417a2.trim().length() > 0 ? strMo20417a2.trim() : "CLOSE";
            string2 = TextUtils.isEmpty(strTrim2) ? string2 : strTrim2;
            String strMo20417a3 = c7975c.mo20417a("skip_reward_dialog_title", "Close Video?");
            String strTrim3 = strMo20417a3.trim().length() > 0 ? strMo20417a3.trim() : "Close Video?";
            string3 = TextUtils.isEmpty(strTrim3) ? string3 : strTrim3;
            String strMo20417a4 = c7975c.mo20417a("skip_reward_dialog_sub_title", "Reward will not be received before video completion.");
            String strTrim4 = strMo20417a4.trim().length() > 0 ? strMo20417a4.trim() : "Reward will not be received before video completion.";
            if (!TextUtils.isEmpty(strTrim4)) {
                string4 = strTrim4;
            }
        }
        button.setText(AbstractC9158i1.m21971a(string, 13));
        button2.setText(AbstractC9158i1.m21971a(string2, 13));
        textView.setText(AbstractC9158i1.m21971a(string3, 20));
        textView2.setText(AbstractC9158i1.m21971a(string4, 100));
        button2.setOnClickListener(new ViewOnClickListenerC8460d0(this));
        button.setOnClickListener(new ViewOnClickListenerC8462e0(this));
    }
}
