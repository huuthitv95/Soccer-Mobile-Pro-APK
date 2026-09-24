package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.ironsource.C11341A5;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p300io.CloseableKt;
import kotlin.p300io.TextStreamsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: AndroidUnityBootConfigDataSource.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m43475d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidUnityBootConfigDataSource;", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getValue", "", "key", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {
    private final Context context;

    public AndroidUnityBootConfigDataSource(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    public String getValue(String key) {
        Object objM44946constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            AndroidUnityBootConfigDataSource androidUnityBootConfigDataSource = this;
            final String str = key + C11341A5.f23808U;
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            InputStream inputStreamOpen = this.context.getAssets().open("bin/Data/boot.config");
            try {
                InputStream stream = inputStreamOpen;
                Intrinsics.checkNotNullExpressionValue(stream, "stream");
                Reader inputStreamReader = new InputStreamReader(stream, Charsets.UTF_8);
                TextStreamsKt.forEachLine(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192), new Function1<String, Unit>() { // from class: com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource$getValue$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                        invoke2(str2);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object, java.lang.String] */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String line) {
                        Intrinsics.checkNotNullParameter(line, "line");
                        if (StringsKt.startsWith$default(line, str, false, 2, (Object) null)) {
                            Ref.ObjectRef<String> objectRef2 = objectRef;
                            ?? Substring = line.substring(str.length());
                            Intrinsics.checkNotNullExpressionValue(Substring, "this as java.lang.String).substring(startIndex)");
                            objectRef2.element = Substring;
                        }
                    }
                });
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(inputStreamOpen, null);
                objM44946constructorimpl = Result.m44946constructorimpl((String) objectRef.element);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(inputStreamOpen, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th3));
        }
        return (String) (Result.m44952isFailureimpl(objM44946constructorimpl) ? null : objM44946constructorimpl);
    }
}
