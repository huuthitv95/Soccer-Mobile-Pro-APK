package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13197f1;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;

/* JADX INFO: loaded from: classes7.dex */
public class MBFeedBackDialog extends Dialog {

    /* JADX INFO: renamed from: a */
    private Button f41187a;

    /* JADX INFO: renamed from: b */
    private Button f41188b;

    /* JADX INFO: renamed from: c */
    private LinearLayout f41189c;

    /* JADX INFO: renamed from: d */
    private InterfaceC14235b f41190d;

    /* JADX INFO: renamed from: e */
    private Button f41191e;

    /* JADX INFO: renamed from: f */
    private TextView f41192f;

    /* JADX INFO: renamed from: g */
    private int f41193g;

    /* JADX INFO: renamed from: h */
    private int f41194h;

    /* JADX INFO: renamed from: com.mbridge.msdk.widget.dialog.MBFeedBackDialog$a */
    class ViewOnClickListenerC14230a implements View.OnClickListener {
        ViewOnClickListenerC14230a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBFeedBackDialog.this.f41190d != null) {
                MBFeedBackDialog.this.f41190d.mo37092b();
            }
            MBFeedBackDialog.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.widget.dialog.MBFeedBackDialog$b */
    class ViewOnClickListenerC14231b implements View.OnClickListener {
        ViewOnClickListenerC14231b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBFeedBackDialog.this.f41190d != null) {
                MBFeedBackDialog.this.f41190d.mo37091a();
            }
            MBFeedBackDialog.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.widget.dialog.MBFeedBackDialog$c */
    class ViewOnClickListenerC14232c implements View.OnClickListener {
        ViewOnClickListenerC14232c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBFeedBackDialog.this.dismiss();
            if (MBFeedBackDialog.this.f41190d != null) {
                MBFeedBackDialog.this.f41190d.mo37093c();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.widget.dialog.MBFeedBackDialog$d */
    class DialogInterfaceOnCancelListenerC14233d implements DialogInterface.OnCancelListener {
        DialogInterfaceOnCancelListenerC14233d() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (MBFeedBackDialog.this.f41190d != null) {
                MBFeedBackDialog.this.f41190d.mo37091a();
            }
        }
    }

    public MBFeedBackDialog(Context context, InterfaceC14235b interfaceC14235b) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(context).inflate(C13203i0.m37707a(context, "mbridge_cm_feedbackview", "layout"), (ViewGroup) null);
        setDialogWidthAndHeight(0.5f, 0.8f);
        this.f41190d = interfaceC14235b;
        if (viewInflate != null) {
            setContentView(viewInflate);
            try {
                this.f41192f = (TextView) viewInflate.findViewById(C13203i0.m37707a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e) {
                C13219q0.m37813a("MBAlertDialog", e.getMessage());
            }
            try {
                this.f41189c = (LinearLayout) viewInflate.findViewById(C13203i0.m37707a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.f41188b = (Button) viewInflate.findViewById(C13203i0.m37707a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f41187a = (Button) viewInflate.findViewById(C13203i0.m37707a(context, "mbridge_video_common_alertview_cancel_button", "id"));
                this.f41191e = (Button) viewInflate.findViewById(C13203i0.m37707a(context, "mbridge_video_common_alertview_private_action_button", "id"));
            } catch (Exception e2) {
                C13219q0.m37813a("MBAlertDialog", e2.getMessage());
            }
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        m42781a();
    }

    /* JADX INFO: renamed from: a */
    private void m42781a() {
        Button button = this.f41187a;
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC14230a());
        }
        Button button2 = this.f41188b;
        if (button2 != null) {
            button2.setOnClickListener(new ViewOnClickListenerC14231b());
        }
        Button button3 = this.f41191e;
        if (button3 != null) {
            button3.setOnClickListener(new ViewOnClickListenerC14232c());
        }
        setOnCancelListener(new DialogInterfaceOnCancelListenerC14233d());
    }

    public static boolean isScreenOrientationPortrait(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public void clear() {
        if (this.f41190d != null) {
            this.f41190d = null;
        }
    }

    public InterfaceC14235b getListener() {
        return this.f41190d;
    }

    public void hideNavigationBar(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            C13197f1.m37677c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }

    public void setCancelButtonClickable(boolean z) {
        Button button = this.f41187a;
        if (button != null) {
            button.setClickable(z);
            if (z) {
                this.f41187a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", C13008c.m36588n().m36550i()));
                this.f41187a.setAlpha(1.0f);
            } else {
                this.f41187a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", C13008c.m36588n().m36550i()));
                this.f41187a.setAlpha(0.4f);
            }
        }
    }

    public void setCancelText(String str) {
        Button button = this.f41187a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setConfirmText(String str) {
    }

    public void setContent(ViewGroup viewGroup) {
        LinearLayout linearLayout = this.f41189c;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = C13229v0.m37876a(C13008c.m36588n().m36542d(), 16.0f);
            layoutParams.rightMargin = C13229v0.m37876a(C13008c.m36588n().m36542d(), 16.0f);
            layoutParams.topMargin = C13229v0.m37876a(C13008c.m36588n().m36542d(), 3.0f);
            layoutParams.bottomMargin = C13229v0.m37876a(C13008c.m36588n().m36542d(), 3.0f);
            this.f41189c.addView(viewGroup, layoutParams);
        }
    }

    public void setDialogWidthAndHeight(float f, float f2) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (!isScreenOrientationPortrait(getContext())) {
            this.f41194h = displayMetrics.heightPixels;
            this.f41193g = displayMetrics.widthPixels;
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = (int) (this.f41193g * f);
            attributes.height = -1;
            attributes.gravity = 17;
            getWindow().setAttributes(attributes);
            return;
        }
        this.f41194h = displayMetrics.widthPixels;
        this.f41193g = displayMetrics.heightPixels;
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        int i = (int) (this.f41193g * f2);
        attributes2.width = -1;
        attributes2.height = i;
        attributes2.gravity = 80;
        getWindow().setAttributes(attributes2);
    }

    public void setListener(InterfaceC14235b interfaceC14235b) {
        this.f41190d = interfaceC14235b;
    }

    public void setPrivacyText(String str) {
        Button button = this.f41191e;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f41192f;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            hideNavigationBar(getWindow());
            getWindow().clearFlags(8);
        } catch (Exception e) {
            C13219q0.m37816b("MBAlertDialog", e.getMessage());
            super.show();
        }
    }
}
