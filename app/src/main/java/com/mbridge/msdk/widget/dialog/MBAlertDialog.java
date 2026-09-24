package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.tools.C13197f1;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13235y0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class MBAlertDialog extends Dialog {

    /* JADX INFO: renamed from: a */
    private Button f41178a;

    /* JADX INFO: renamed from: b */
    private Button f41179b;

    /* JADX INFO: renamed from: c */
    private TextView f41180c;

    /* JADX INFO: renamed from: d */
    private InterfaceC14235b f41181d;

    /* JADX INFO: renamed from: e */
    private TextView f41182e;

    /* JADX INFO: renamed from: com.mbridge.msdk.widget.dialog.MBAlertDialog$a */
    class ViewOnClickListenerC14228a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC14235b f41183a;

        ViewOnClickListenerC14228a(InterfaceC14235b interfaceC14235b) {
            this.f41183a = interfaceC14235b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC14235b interfaceC14235b = this.f41183a;
            if (interfaceC14235b != null) {
                interfaceC14235b.mo37092b();
            }
            MBAlertDialog.this.cancel();
            MBAlertDialog.this.clear();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.widget.dialog.MBAlertDialog$b */
    class ViewOnClickListenerC14229b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC14235b f41185a;

        ViewOnClickListenerC14229b(InterfaceC14235b interfaceC14235b) {
            this.f41185a = interfaceC14235b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC14235b interfaceC14235b = this.f41185a;
            if (interfaceC14235b != null) {
                interfaceC14235b.mo37091a();
            }
            MBAlertDialog.this.cancel();
            MBAlertDialog.this.clear();
        }
    }

    public MBAlertDialog(Context context, InterfaceC14235b interfaceC14235b) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(context).inflate(C13203i0.m37707a(context, "mbridge_cm_alertview", "layout"), (ViewGroup) null);
        this.f41181d = interfaceC14235b;
        if (viewInflate != null) {
            setContentView(viewInflate);
            try {
                this.f41182e = (TextView) viewInflate.findViewById(C13203i0.m37707a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e) {
                C13219q0.m37813a("MBAlertDialog", e.getMessage());
            }
            try {
                this.f41180c = (TextView) viewInflate.findViewById(C13203i0.m37707a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.f41179b = (Button) viewInflate.findViewById(C13203i0.m37707a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f41178a = (Button) viewInflate.findViewById(C13203i0.m37707a(context, "mbridge_video_common_alertview_cancel_button", "id"));
            } catch (Exception e2) {
                C13219q0.m37813a("MBAlertDialog", e2.getMessage());
            }
        }
        Button button = this.f41178a;
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC14228a(interfaceC14235b));
        }
        Button button2 = this.f41179b;
        if (button2 != null) {
            button2.setOnClickListener(new ViewOnClickListenerC14229b(interfaceC14235b));
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    /* JADX INFO: renamed from: a */
    private void m42776a() {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            setTitle("Confirm to close? ");
            setContent("You will not be rewarded after closing the window");
            setConfirmText("Close it");
            setCancelText("Continue");
            return;
        }
        setTitle("确认关闭？");
        setContent("关闭后您将不会获得任何奖励噢~ ");
        setConfirmText("确认关闭");
        setCancelText("继续试玩");
    }

    /* JADX INFO: renamed from: a */
    private void m42777a(int i) {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            setTitle(i == C13088a.f35842H ? "Confirm" : "Tips");
            setContent(i == C13088a.f35842H ? "If you choose to continue, you will receive a reward after the end. Confirm closed?" : "If you choose to continue, you will receive a reward after the end. Whether to continue?");
            setConfirmText(i == C13088a.f35842H ? "Close" : "Cancel");
            setCancelText("Continue");
            return;
        }
        setTitle(i == C13088a.f35842H ? "确认关闭？" : "提示");
        setContent(i == C13088a.f35842H ? "如果你选择继续，结束后将会获得奖励。确认关闭吗？" : "如果你选择继续，结束后将会获得奖励。是否继续？");
        setConfirmText(i == C13088a.f35842H ? "确认关闭" : "取消");
        setCancelText("继续");
    }

    /* JADX INFO: renamed from: a */
    private void m42778a(String str, String str2, String str3, String str4) {
        setTitle(str);
        setContent(str2);
        setConfirmText(str3);
        setCancelText(str4);
    }

    /* JADX INFO: renamed from: b */
    private void m42779b() {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            setTitle("Confirm to close? ");
            setContent("You will not be rewarded after closing the window");
            setConfirmText("Close it");
            setCancelText("Continue");
            return;
        }
        setTitle("确认关闭？");
        setContent("关闭后您将不会获得任何奖励噢~ ");
        setConfirmText("确认关闭");
        setCancelText("继续观看");
    }

    public void clear() {
        if (this.f41181d != null) {
            this.f41181d = null;
        }
    }

    public InterfaceC14235b getListener() {
        return this.f41181d;
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

    public void makeDownloadAlert(String str) {
        C14234a.m42782a(this, str);
    }

    public void makeIVAlertView(int i, String str) {
        try {
            String string = C13235y0.m37956a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = C13235y0.m37956a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            String string3 = C13235y0.m37956a(getContext(), "MBridge_CancelText" + str, "").toString();
            String string4 = C13235y0.m37956a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                m42777a(i);
            } else {
                m42778a(string, string2, string3, string4);
            }
        } catch (Exception e) {
            C13219q0.m37813a("MBAlertDialog", e.getMessage());
        }
    }

    public void makeInsAlert(String str) {
        C14234a.m42783b(this, str);
    }

    public void makePlayableAlertView() {
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d != null) {
            m42778a(c13635gM39718d.m39563t(), c13635gM39718d.m39555r(), c13635gM39718d.m39559s(), c13635gM39718d.m39547p());
        } else {
            m42776a();
        }
    }

    public void makeRVAlertView(String str) {
        try {
            String string = C13235y0.m37956a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = C13235y0.m37956a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            String string3 = C13235y0.m37956a(getContext(), "MBridge_CancelText" + str, "").toString();
            String string4 = C13235y0.m37956a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                if (c13635gM39718d != null) {
                    m42778a(c13635gM39718d.m39563t(), c13635gM39718d.m39555r(), c13635gM39718d.m39559s(), c13635gM39718d.m39551q());
                    return;
                } else {
                    m42779b();
                    return;
                }
            }
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(string)) {
                if (c13635gM39718d != null) {
                    string = c13635gM39718d.m39563t();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setTitle("Confirm to close? ");
                } else {
                    setTitle("确认关闭？");
                }
            }
            if (TextUtils.isEmpty(string2)) {
                if (c13635gM39718d != null) {
                    string2 = c13635gM39718d.m39555r();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setContent("You will not be rewarded after closing the window");
                } else {
                    setContent("关闭后您将不会获得任何奖励噢~ ");
                }
            }
            if (TextUtils.isEmpty(string4)) {
                if (c13635gM39718d != null) {
                    string4 = c13635gM39718d.m39559s();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setConfirmText("Close it");
                } else {
                    setConfirmText("确认关闭");
                }
            }
            if (TextUtils.isEmpty(string3)) {
                if (c13635gM39718d != null) {
                    string3 = c13635gM39718d.m39551q();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setCancelText("Continue");
                } else {
                    setCancelText("继续观看");
                }
            }
            m42778a(string, string2, string4, string3);
        } catch (Exception e) {
            C13219q0.m37813a("MBAlertDialog", e.getMessage());
        }
    }

    public void onlyShow() {
        super.show();
    }

    public void setCancelText(String str) {
        Button button = this.f41178a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setConfirmText(String str) {
        Button button = this.f41179b;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setContent(String str) {
        TextView textView = this.f41180c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f41182e;
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
