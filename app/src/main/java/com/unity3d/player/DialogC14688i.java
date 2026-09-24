package com.unity3d.player;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: renamed from: com.unity3d.player.i */
/* JADX INFO: loaded from: classes7.dex */
public final class DialogC14688i extends Dialog implements TextWatcher, View.OnClickListener {

    /* JADX INFO: renamed from: d */
    private static int f41732d = 1627389952;

    /* JADX INFO: renamed from: e */
    private static int f41733e = -1;

    /* JADX INFO: renamed from: a */
    public boolean f41734a;

    /* JADX INFO: renamed from: b */
    private Context f41735b;

    /* JADX INFO: renamed from: c */
    private UnityPlayer f41736c;

    /* JADX INFO: renamed from: f */
    private int f41737f;

    /* JADX INFO: renamed from: g */
    private boolean f41738g;

    /* JADX INFO: renamed from: com.unity3d.player.i$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private static final int f41744a = View.generateViewId();

        /* JADX INFO: renamed from: b */
        private static final int f41745b = View.generateViewId();

        /* JADX INFO: renamed from: c */
        private static final int f41746c = View.generateViewId();
    }

    public DialogC14688i(Context context, UnityPlayer unityPlayer, String str, int i, boolean z, boolean z2, boolean z3, String str2, int i2, boolean z4, boolean z5) {
        super(context);
        this.f41735b = context;
        this.f41736c = unityPlayer;
        Window window = getWindow();
        this.f41734a = z5;
        window.requestFeature(1);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.x = 0;
        attributes.y = 0;
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable(0));
        final View viewCreateSoftInputView = createSoftInputView();
        setContentView(viewCreateSoftInputView);
        window.setLayout(-1, -2);
        window.clearFlags(2);
        window.clearFlags(134217728);
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        if (!this.f41734a) {
            window.addFlags(32);
            window.addFlags(262144);
        }
        EditText editText = (EditText) findViewById(a.f41745b);
        Button button = (Button) findViewById(a.f41744a);
        m43396a(editText, str, i, z, z2, z3, str2, i2);
        button.setOnClickListener(this);
        this.f41737f = editText.getCurrentTextColor();
        m43406a(z4);
        this.f41736c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.unity3d.player.i.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (viewCreateSoftInputView.isShown()) {
                    Rect rect = new Rect();
                    DialogC14688i.this.f41736c.getWindowVisibleDisplayFrame(rect);
                    int[] iArr = new int[2];
                    DialogC14688i.this.f41736c.getLocationOnScreen(iArr);
                    Point point = new Point(rect.left - iArr[0], rect.height() - viewCreateSoftInputView.getHeight());
                    Point point2 = new Point();
                    DialogC14688i.this.getWindow().getWindowManager().getDefaultDisplay().getSize(point2);
                    int height = DialogC14688i.this.f41736c.getHeight() - point2.y;
                    int height2 = DialogC14688i.this.f41736c.getHeight() - point.y;
                    if (height2 != height + viewCreateSoftInputView.getHeight()) {
                        DialogC14688i.this.f41736c.reportSoftInputIsVisible(true);
                    } else {
                        DialogC14688i.this.f41736c.reportSoftInputIsVisible(false);
                    }
                    DialogC14688i.this.f41736c.reportSoftInputArea(new Rect(point.x, point.y, viewCreateSoftInputView.getWidth(), height2));
                }
            }
        });
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.unity3d.player.i.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                if (z6) {
                    DialogC14688i.this.getWindow().setSoftInputMode(5);
                }
            }
        });
        editText.requestFocus();
    }

    /* JADX INFO: renamed from: a */
    private static int m43394a(int i, boolean z, boolean z2, boolean z3) {
        int i2 = (z ? 32768 : 524288) | (z2 ? 131072 : 0) | (z3 ? 128 : 0);
        if (i < 0 || i > 11) {
            return i2;
        }
        int i3 = new int[]{1, 16385, 12290, 17, 2, 3, 8289, 33, 1, 16417, 17, 8194}[i];
        return (i3 & 2) != 0 ? i3 : i3 | i2;
    }

    /* JADX INFO: renamed from: a */
    private void m43396a(EditText editText, String str, int i, boolean z, boolean z2, boolean z3, String str2, int i2) {
        editText.setImeOptions(6);
        editText.setText(str);
        editText.setHint(str2);
        editText.setHintTextColor(f41732d);
        editText.setInputType(m43394a(i, z, z2, z3));
        editText.setImeOptions(33554432);
        if (i2 > 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
        }
        editText.addTextChangedListener(this);
        editText.setSelection(editText.getText().length());
        editText.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m43398a(String str, boolean z) {
        ((EditText) findViewById(a.f41745b)).setSelection(0, 0);
        this.f41736c.reportSoftInputStr(str, 1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public String m43399b() {
        EditText editText = (EditText) findViewById(a.f41745b);
        if (editText == null) {
            return null;
        }
        return editText.getText().toString();
    }

    /* JADX INFO: renamed from: a */
    public final String m43402a() {
        InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) this.f41735b.getSystemService("input_method")).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype == null) {
            return null;
        }
        String locale = currentInputMethodSubtype.getLocale();
        if (locale != null && !locale.equals("")) {
            return locale;
        }
        return currentInputMethodSubtype.getMode() + " " + currentInputMethodSubtype.getExtraValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m43403a(int i) {
        EditText editText = (EditText) findViewById(a.f41745b);
        if (editText != null) {
            if (i > 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
            } else {
                editText.setFilters(new InputFilter[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m43404a(int i, int i2) {
        int i3;
        EditText editText = (EditText) findViewById(a.f41745b);
        if (editText == null || editText.getText().length() < (i3 = i2 + i)) {
            return;
        }
        editText.setSelection(i, i3);
    }

    /* JADX INFO: renamed from: a */
    public final void m43405a(String str) {
        EditText editText = (EditText) findViewById(a.f41745b);
        if (editText != null) {
            editText.setText(str);
            editText.setSelection(str.length());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m43406a(boolean z) {
        this.f41738g = z;
        EditText editText = (EditText) findViewById(a.f41745b);
        Button button = (Button) findViewById(a.f41744a);
        View viewFindViewById = findViewById(a.f41746c);
        if (!z) {
            editText.setBackgroundColor(f41733e);
            editText.setTextColor(this.f41737f);
            editText.setCursorVisible(true);
            editText.setOnClickListener(null);
            editText.setLongClickable(true);
            button.setClickable(true);
            button.setTextColor(this.f41737f);
            viewFindViewById.setBackgroundColor(f41733e);
            return;
        }
        editText.setBackgroundColor(0);
        editText.setTextColor(0);
        editText.setCursorVisible(false);
        editText.setOnClickListener(this);
        editText.setHighlightColor(0);
        editText.setLongClickable(false);
        button.setTextColor(0);
        viewFindViewById.setBackgroundColor(0);
        viewFindViewById.setOnClickListener(this);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f41736c.reportSoftInputStr(editable.toString(), 0, false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    protected final View createSoftInputView() {
        RelativeLayout relativeLayout = new RelativeLayout(this.f41735b);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(f41733e);
        relativeLayout.setId(a.f41746c);
        EditText editText = new EditText(this.f41735b) { // from class: com.unity3d.player.i.3
            @Override // android.widget.TextView, android.view.View
            public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
                if (i == 4) {
                    DialogC14688i dialogC14688i = DialogC14688i.this;
                    dialogC14688i.m43398a(dialogC14688i.m43399b(), true);
                    return true;
                }
                if (i == 84) {
                    return true;
                }
                return super.onKeyPreIme(i, keyEvent);
            }

            @Override // android.widget.TextView
            protected final void onSelectionChanged(int i, int i2) {
                DialogC14688i.this.f41736c.reportSoftInputSelection(i, i2 - i);
            }

            @Override // android.widget.TextView, android.view.View
            public final void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                if (z) {
                    ((InputMethodManager) DialogC14688i.this.f41735b.getSystemService("input_method")).showSoftInput(this, 0);
                }
            }
        };
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(0, a.f41744a);
        editText.setLayoutParams(layoutParams);
        editText.setId(a.f41745b);
        relativeLayout.addView(editText);
        Button button = new Button(this.f41735b);
        button.setText(this.f41735b.getResources().getIdentifier("ok", TypedValues.Custom.S_STRING, "android"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(11);
        button.setLayoutParams(layoutParams2);
        button.setId(a.f41744a);
        button.setBackgroundColor(0);
        relativeLayout.addView(button);
        ((EditText) relativeLayout.findViewById(a.f41745b)).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.unity3d.player.i.4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 6) {
                    DialogC14688i dialogC14688i = DialogC14688i.this;
                    dialogC14688i.m43398a(dialogC14688i.m43399b(), false);
                }
                return false;
            }
        });
        relativeLayout.setPadding(16, 16, 16, 16);
        return relativeLayout;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f41734a || !(motionEvent.getAction() == 4 || this.f41738g)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        m43398a(m43399b(), true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m43398a(m43399b(), false);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
