package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: AndroidAppSetIdDataSource.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u000eH\u0086\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m43475d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_appSetIdFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "appSetId", "getAppSetId", "()Ljava/lang/String;", "isCollecting", "", "invoke", "", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidAppSetIdDataSource {
    private final MutableStateFlow<String> _appSetIdFlow;
    private final Context applicationContext;
    private final MutableStateFlow<Boolean> isCollecting;

    public AndroidAppSetIdDataSource(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
        this.isCollecting = StateFlowKt.MutableStateFlow(false);
        this._appSetIdFlow = StateFlowKt.MutableStateFlow(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final String getAppSetId() {
        return this._appSetIdFlow.getValue();
    }

    public final void invoke() {
        Boolean value;
        Boolean bool;
        MutableStateFlow<Boolean> mutableStateFlow = this.isCollecting;
        do {
            value = mutableStateFlow.getValue();
            bool = value;
            bool.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, true));
        if (bool.booleanValue()) {
            return;
        }
        try {
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(this.applicationContext).getAppSetIdInfo();
            final Function1<AppSetIdInfo, Unit> function1 = new Function1<AppSetIdInfo, Unit>() { // from class: com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource.invoke.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AppSetIdInfo appSetIdInfo2) {
                    invoke2(appSetIdInfo2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AppSetIdInfo appSetIdInfo2) {
                    String id = appSetIdInfo2.getId();
                    Intrinsics.checkNotNullExpressionValue(id, "it.id");
                    AndroidAppSetIdDataSource.this._appSetIdFlow.setValue(id);
                }
            };
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    AndroidAppSetIdDataSource.invoke$lambda$1(function1, obj);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
