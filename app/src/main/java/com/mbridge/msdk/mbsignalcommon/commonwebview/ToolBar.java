package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13229v0;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ToolBar extends LinearLayout {
    public static final String BACKWARD = "backward";
    public static final String EXITS = "exits";
    public static final String FORWARD = "forward";
    public static final String OPEN_BY_BROWSER = "open_by_browser";
    public static final String REFRESH = "refresh";
    public String title;
    public TextView titleView;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar$a */
    public static class C13367a {

        /* JADX INFO: renamed from: b */
        public static int f37098b = 40;

        /* JADX INFO: renamed from: a */
        public int f37099a;

        /* JADX INFO: renamed from: a */
        public void m38653a(int i) {
            this.f37099a = i;
        }

        /* JADX INFO: renamed from: b */
        public void m38654b(int i) {
            f37098b = i;
        }

        /* JADX INFO: renamed from: a */
        public int m38652a() {
            return f37098b;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar$b */
    public static class C13368b {

        /* JADX INFO: renamed from: a */
        public String f37100a;

        /* JADX INFO: renamed from: b */
        public String f37101b;

        /* JADX INFO: renamed from: c */
        public boolean f37102c = true;

        /* JADX INFO: renamed from: d */
        public View.OnClickListener f37103d;

        public C13368b(String str) {
            this.f37100a = str;
        }

        /* JADX INFO: renamed from: a */
        public C13368b m38655a(View.OnClickListener onClickListener) {
            this.f37103d = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C13368b m38656a(String str) {
            this.f37101b = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C13368b m38657a(boolean z) {
            this.f37102c = z;
            return this;
        }
    }

    public ToolBar(Context context) {
        super(context);
        m38651c();
    }

    /* JADX INFO: renamed from: a */
    private void m38648a(C13367a c13367a, List<C13368b> list) {
        setOrientation(0);
        try {
            int iM37876a = C13229v0.m37876a(getContext(), 10.0f);
            setPadding(0, iM37876a, C13229v0.m37876a(getContext(), 20.0f), iM37876a);
        } catch (Exception unused) {
        }
        try {
            for (C13368b c13368b : list) {
                ImageView imageView = (ImageView) m38650b();
                imageView.setTag(c13368b.f37100a);
                imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(c13368b.f37101b, "drawable", C13008c.m36588n().m36550i())));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c13367a.m38652a(), -1);
                layoutParams.setMargins(32, 0, 32, 0);
                imageView.setLayoutParams(layoutParams);
                imageView.setOnClickListener(c13368b.f37103d);
                if (!c13368b.f37102c) {
                    imageView.setVisibility(8);
                }
                addView(imageView);
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: b */
    private View m38650b() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        imageView.setLayoutParams(layoutParams);
        imageView.setClickable(true);
        return imageView;
    }

    /* JADX INFO: renamed from: c */
    private void m38651c() {
        setOrientation(0);
        try {
            int iM37876a = C13229v0.m37876a(getContext(), 10.0f);
            setPadding(0, iM37876a, 0, iM37876a);
        } catch (Exception unused) {
        }
        try {
            ImageView imageView = (ImageView) m38650b();
            imageView.setTag(BACKWARD);
            imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_backward", "drawable", C13008c.m36588n().m36550i())));
            addView(imageView);
        } catch (Exception unused2) {
        }
        try {
            ImageView imageView2 = (ImageView) m38650b();
            imageView2.setTag(FORWARD);
            imageView2.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_forward", "drawable", C13008c.m36588n().m36550i())));
            addView(imageView2);
        } catch (Exception unused3) {
        }
        try {
            ImageView imageView3 = (ImageView) m38650b();
            imageView3.setTag(REFRESH);
            imageView3.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_refresh", "drawable", C13008c.m36588n().m36550i())));
            addView(imageView3);
        } catch (Exception unused4) {
        }
        try {
            ImageView imageView4 = (ImageView) m38650b();
            imageView4.setTag(OPEN_BY_BROWSER);
            imageView4.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_browser", "drawable", C13008c.m36588n().m36550i())));
            addView(imageView4);
        } catch (Exception unused5) {
        }
        try {
            ImageView imageView5 = (ImageView) m38650b();
            imageView5.setTag(EXITS);
            imageView5.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_exits", "drawable", C13008c.m36588n().m36550i())));
            addView(imageView5);
        } catch (Exception unused6) {
        }
    }

    public View getItem(String str) {
        return findViewWithTag(str);
    }

    public void hideTitle() {
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText("");
        }
    }

    public void setButtonIcon(String str, String str2) {
        ((ImageView) findViewWithTag(str)).setImageDrawable(getResources().getDrawable(getResources().getIdentifier(str2, "drawable", C13008c.m36588n().m36550i())));
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setOnClickListener(onClickListener);
        }
    }

    public void setTitle(String str, int i) {
        this.title = str;
        if (this.titleView == null) {
            TextView textView = (TextView) m38647a();
            this.titleView = textView;
            textView.setPadding(64, 0, 10, 0);
            this.titleView.setTextColor(i);
            addView(this.titleView, 0);
        }
        this.titleView.setText(str);
    }

    public void showTitle() {
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText(this.title);
        }
    }

    public ToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m38651c();
    }

    public ToolBar(Context context, List<C13368b> list) {
        super(context);
        m38649a(list);
    }

    public ToolBar(Context context, AttributeSet attributeSet, List<C13368b> list) {
        super(context, attributeSet);
        m38649a(list);
    }

    public ToolBar(Context context, C13367a c13367a, List<C13368b> list) {
        super(context);
        m38648a(c13367a, list);
    }

    public void setTitle(String str) {
        setTitle(str, ViewCompat.MEASURED_STATE_MASK);
    }

    public ToolBar(Context context, AttributeSet attributeSet, C13367a c13367a, List<C13368b> list) {
        super(context, attributeSet);
        m38648a(c13367a, list);
    }

    /* JADX INFO: renamed from: a */
    private void m38649a(List<C13368b> list) {
        setOrientation(0);
        try {
            int iM37876a = C13229v0.m37876a(getContext(), 10.0f);
            setPadding(0, iM37876a, 0, iM37876a);
        } catch (Exception unused) {
        }
        try {
            for (C13368b c13368b : list) {
                ImageView imageView = (ImageView) m38650b();
                imageView.setTag(c13368b.f37100a);
                imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(c13368b.f37101b, "drawable", C13008c.m36588n().m36550i())));
                imageView.setOnClickListener(c13368b.f37103d);
                if (!c13368b.f37102c) {
                    imageView.setVisibility(8);
                }
                addView(imageView);
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    private View m38647a() {
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        textView.setLayoutParams(layoutParams);
        textView.setClickable(true);
        return textView;
    }
}
