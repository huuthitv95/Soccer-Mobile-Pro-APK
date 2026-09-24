package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: ConfigFileFromLocalStorage.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage", m43504f = "ConfigFileFromLocalStorage.kt", m43505i = {}, m43506l = {27}, m43507m = "doWork-gIAlu-s", m43508n = {}, m43509s = {})
final class ConfigFileFromLocalStorage$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfigFileFromLocalStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigFileFromLocalStorage$doWork$1(ConfigFileFromLocalStorage configFileFromLocalStorage, Continuation<? super ConfigFileFromLocalStorage$doWork$1> continuation) {
        super(continuation);
        this.this$0 = configFileFromLocalStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM44714doWorkgIAlus = this.this$0.m44714doWorkgIAlus((ConfigFileFromLocalStorage.Params) null, (Continuation<? super Result<? extends Configuration>>) this);
        return objM44714doWorkgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM44714doWorkgIAlus : Result.m44945boximpl(objM44714doWorkgIAlus);
    }
}
