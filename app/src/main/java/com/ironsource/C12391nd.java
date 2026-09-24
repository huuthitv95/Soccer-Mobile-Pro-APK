package com.ironsource;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.nd */
/* JADX INFO: loaded from: classes6.dex */
public final class C12391nd {

    /* JADX INFO: renamed from: a */
    public static final a f31562a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.nd$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final View m32826a(Context context, String str, InterfaceC11664S8 imageLoader) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            if (str == null) {
                return m32825a(context);
            }
            Object objMo27341a = imageLoader.mo27341a(str);
            if (Result.m44952isFailureimpl(objMo27341a)) {
                objMo27341a = null;
            }
            Drawable drawable = (Drawable) objMo27341a;
            if (drawable == null) {
                return m32825a(context);
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(drawable);
            return imageView;
        }

        private a() {
        }

        /* JADX INFO: renamed from: a */
        private static final GradientDrawable m32824a() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor("#000000"));
            return gradientDrawable;
        }

        /* JADX INFO: renamed from: a */
        private final View m32825a(Context context) {
            TextView textView = new TextView(context);
            textView.setText(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextSize(15.0f);
            textView.setBackground(m32824a());
            textView.setAlpha(0.2f);
            textView.setPadding(21, 0, 21, 0);
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            return textView;
        }
    }
}
