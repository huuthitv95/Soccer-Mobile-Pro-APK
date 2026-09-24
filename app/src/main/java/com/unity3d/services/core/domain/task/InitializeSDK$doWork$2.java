package com.unity3d.services.core.domain.task;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: InitializeSDK.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m43475d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", m43504f = "InitializeSDK.kt", m43505i = {0, 1, 2, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 8, 9, 9, 10, 11}, m43506l = {48, 53, 58, 60, 65, 67, 71, TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER, 89, 92, 100, 103, 106}, m43507m = "invokeSuspend", m43508n = {"$this$withContext", "$this$withContext", "$this$withContext", "configuration", "resetResult", "$this$withContext", "configuration", "$this$withContext", "configResult", "configuration", "$this$withContext", "configResult", "configuration", "loadCacheResult", "configResult", "configResult", "loadWebResult", "configResult", "configResult"}, m43509s = {"L$0", "L$0", "L$0", "L$2", "L$0", "L$0", "L$2", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$0", "L$1", "L$1", "L$2", "L$1", "L$1"})
final class InitializeSDK$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeSDK$doWork$2(InitializeSDK initializeSDK, Continuation<? super InitializeSDK$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, continuation);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((InitializeSDK$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:106:0x02cf A[Catch: all -> 0x0368, CancellationException -> 0x0396, TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ee A[Catch: all -> 0x0368, CancellationException -> 0x0396, TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0317  */
    /* JADX WARN: Code duplicated, block: B:115:0x0318  */
    /* JADX WARN: Code duplicated, block: B:118:0x0320 A[Catch: all -> 0x0368, CancellationException -> 0x0396, TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0332  */
    /* JADX WARN: Code duplicated, block: B:121:0x0333 A[Catch: all -> 0x0368, CancellationException -> 0x0396, PHI: r0 r2
  0x0333: PHI (r0v50 java.lang.Object) = (r0v48 java.lang.Object), (r0v48 java.lang.Object), (r0v53 java.lang.Object) binds: [B:117:0x031e, B:119:0x0330, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r2v32 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r2v29 com.unity3d.services.core.domain.task.InitializeSDK)
  (r2v29 com.unity3d.services.core.domain.task.InitializeSDK)
  (r2v36 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:117:0x031e, B:119:0x0330, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:125:0x035c A[Catch: all -> 0x0368, CancellationException -> 0x0396, TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x005a A[PHI: r2 r3 r13
  0x005a: PHI (r2v21 java.lang.Object) = (r2v18 java.lang.Object), (r2v24 java.lang.Object) binds: [B:102:0x02c5, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r3v21 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r3v18 com.unity3d.services.core.domain.task.InitializeSDK)
  (r3v22 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:102:0x02c5, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r13v66 java.lang.Object) = (r13v54 java.lang.Object), (r13v71 java.lang.Object) binds: [B:102:0x02c5, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0080 A[PHI: r0 r2 r3 r5 r13
  0x0080: PHI (r0v29 com.unity3d.services.core.configuration.Configuration) = 
  (r0v26 com.unity3d.services.core.configuration.Configuration)
  (r0v36 com.unity3d.services.core.configuration.Configuration)
 binds: [B:83:0x0234, B:25:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r2v18 java.lang.Object) = (r2v16 java.lang.Object), (r2v20 java.lang.Object) binds: [B:83:0x0234, B:25:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r3v18 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r3v15 com.unity3d.services.core.domain.task.InitializeSDK)
  (r3v20 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:83:0x0234, B:25:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r5v19 kotlinx.coroutines.CoroutineScope) = (r5v16 kotlinx.coroutines.CoroutineScope), (r5v25 kotlinx.coroutines.CoroutineScope) binds: [B:83:0x0234, B:25:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r13v46 java.lang.Object) = (r13v45 java.lang.Object), (r13v61 java.lang.Object) binds: [B:83:0x0234, B:25:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3 A[PHI: r0 r2 r3 r13
  0x00d3: PHI (r0v12 com.unity3d.services.core.configuration.Configuration) = 
  (r0v9 com.unity3d.services.core.configuration.Configuration)
  (r0v18 com.unity3d.services.core.configuration.Configuration)
 binds: [B:62:0x01a2, B:37:0x00ca] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r2v8 com.unity3d.services.core.domain.task.InitializeSDK) = (r2v5 com.unity3d.services.core.domain.task.InitializeSDK), (r2v11 com.unity3d.services.core.domain.task.InitializeSDK) binds: [B:62:0x01a2, B:37:0x00ca] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r3v6 kotlinx.coroutines.CoroutineScope) = (r3v3 kotlinx.coroutines.CoroutineScope), (r3v10 kotlinx.coroutines.CoroutineScope) binds: [B:62:0x01a2, B:37:0x00ca] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r13v30 java.lang.Object) = (r13v26 java.lang.Object), (r13v34 java.lang.Object) binds: [B:62:0x01a2, B:37:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0142 A[Catch: all -> 0x0368, CancellationException -> 0x0396, PHI: r2 r5
  0x0142: PHI (r2v2 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r2v1 com.unity3d.services.core.domain.task.InitializeSDK)
  (r2v1 com.unity3d.services.core.domain.task.InitializeSDK)
  (r2v4 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:47:0x011f, B:49:0x013e, B:43:0x00f3] A[DONT_GENERATE, DONT_INLINE]
  0x0142: PHI (r5v2 kotlinx.coroutines.CoroutineScope) = 
  (r5v1 kotlinx.coroutines.CoroutineScope)
  (r5v1 kotlinx.coroutines.CoroutineScope)
  (r5v4 kotlinx.coroutines.CoroutineScope)
 binds: [B:47:0x011f, B:49:0x013e, B:43:0x00f3] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x015f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0161  */
    /* JADX WARN: Code duplicated, block: B:57:0x0168 A[Catch: all -> 0x0368, CancellationException -> 0x0396, TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0186  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ac A[Catch: all -> 0x0368, CancellationException -> 0x0396, TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c9 A[Catch: all -> 0x0368, CancellationException -> 0x0396, TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01d7 A[Catch: all -> 0x0368, CancellationException -> 0x0396, TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01fd A[Catch: all -> 0x0368, CancellationException -> 0x0396, TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0212  */
    /* JADX WARN: Code duplicated, block: B:82:0x0214 A[Catch: all -> 0x0368, CancellationException -> 0x0396, PHI: r0 r2 r3 r5
  0x0214: PHI (r0v26 com.unity3d.services.core.configuration.Configuration) = 
  (r0v23 com.unity3d.services.core.configuration.Configuration)
  (r0v23 com.unity3d.services.core.configuration.Configuration)
  (r0v28 com.unity3d.services.core.configuration.Configuration)
 binds: [B:78:0x01fb, B:80:0x0210, B:28:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x0214: PHI (r2v16 java.lang.Object) = (r2v12 java.lang.Object), (r2v12 java.lang.Object), (r2v17 java.lang.Object) binds: [B:78:0x01fb, B:80:0x0210, B:28:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x0214: PHI (r3v15 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r3v11 com.unity3d.services.core.domain.task.InitializeSDK)
  (r3v11 com.unity3d.services.core.domain.task.InitializeSDK)
  (r3v17 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:78:0x01fb, B:80:0x0210, B:28:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x0214: PHI (r5v16 kotlinx.coroutines.CoroutineScope) = 
  (r5v14 kotlinx.coroutines.CoroutineScope)
  (r5v14 kotlinx.coroutines.CoroutineScope)
  (r5v18 kotlinx.coroutines.CoroutineScope)
 binds: [B:78:0x01fb, B:80:0x0210, B:28:0x0093] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0236  */
    /* JADX WARN: Code duplicated, block: B:87:0x023e A[Catch: all -> 0x0368, CancellationException -> 0x0396, TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0256  */
    /* JADX WARN: Code duplicated, block: B:92:0x025e A[Catch: all -> 0x0368, CancellationException -> 0x0396, TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:94:0x026c A[Catch: all -> 0x0368, CancellationException -> 0x0396, TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0277 A[Catch: all -> 0x0368, CancellationException -> 0x0396, TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0281 A[Catch: all -> 0x0368, CancellationException -> 0x0396, TryCatch #2 {CancellationException -> 0x0396, all -> 0x0368, blocks: (B:6:0x0015, B:124:0x0352, B:9:0x0026, B:121:0x0333, B:12:0x0031, B:116:0x031a, B:118:0x0320, B:15:0x0044, B:109:0x02e4, B:112:0x02f4, B:18:0x004f, B:104:0x02c9, B:106:0x02cf, B:22:0x005f, B:90:0x0258, B:92:0x025e, B:93:0x026b, B:25:0x0077, B:85:0x0238, B:87:0x023e, B:94:0x026c, B:96:0x0277, B:98:0x0281, B:100:0x0287, B:101:0x02a4, B:110:0x02ee, B:125:0x035c, B:126:0x0367, B:28:0x0093, B:82:0x0214, B:31:0x00a4, B:77:0x01f7, B:79:0x01fd, B:34:0x00b4, B:69:0x01c3, B:71:0x01c9, B:72:0x01d6, B:37:0x00ca, B:64:0x01a6, B:66:0x01ac, B:73:0x01d7, B:40:0x00e0, B:55:0x0162, B:57:0x0168, B:58:0x017b, B:61:0x0187, B:43:0x00f3, B:51:0x0142, B:46:0x0101, B:48:0x0121), top: B:140:0x000a }] */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x034f, code lost:
    
        if (r13 == r1) goto L123;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0168, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
