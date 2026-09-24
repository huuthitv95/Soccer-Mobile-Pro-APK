package gatewayprotocol.p299v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DiagnosticEventKt.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m43475d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class DiagnosticEventKt {
    public static final DiagnosticEventKt INSTANCE = new DiagnosticEventKt();

    /* JADX INFO: compiled from: DiagnosticEventKt.kt */
    @Metadata(m43474d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0010\u001c\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u000f\b\u0007\u0018\u0000 \u009d\u00012\u00020\u0001:\b\u009d\u0001\u009e\u0001\u009f\u0001 \u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010b\u001a\u00020cH\u0001J\u0006\u0010d\u001a\u00020eJ\u0006\u0010f\u001a\u00020eJ\u0006\u0010g\u001a\u00020eJ\u0006\u0010h\u001a\u00020eJ\u0006\u0010i\u001a\u00020eJ\u0006\u0010j\u001a\u00020eJ\u0006\u0010k\u001a\u00020eJ\u0006\u0010l\u001a\u00020eJ\u0006\u0010m\u001a\u00020eJ\u0006\u0010n\u001a\u00020eJ\u0006\u0010o\u001a\u00020eJ\u0006\u0010p\u001a\u00020eJ\u0006\u0010q\u001a\u00020eJ\u0006\u0010r\u001a\u00020eJ\u0006\u0010s\u001a\u00020>J\u0006\u0010t\u001a\u00020>J\u0006\u0010u\u001a\u00020>J\u0006\u0010v\u001a\u00020>J\u0006\u0010w\u001a\u00020>J\u0006\u0010x\u001a\u00020>J\u0006\u0010y\u001a\u00020>J\u0006\u0010z\u001a\u00020>J\u0006\u0010{\u001a\u00020>J\u0006\u0010|\u001a\u00020>J\u0006\u0010}\u001a\u00020>J\u0006\u0010~\u001a\u00020>J&\u0010\u007f\u001a\u00020e*\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020S0Q2\u0006\u0010\u0005\u001a\u00020RH\u0007¢\u0006\u0003\b\u0080\u0001J/\u0010\u0081\u0001\u001a\u00020e*\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020S0Q2\u000e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020R0\u0083\u0001H\u0007¢\u0006\u0003\b\u0084\u0001J\u001f\u0010\u0085\u0001\u001a\u00020e*\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020S0QH\u0007¢\u0006\u0003\b\u0086\u0001J%\u0010\u0085\u0001\u001a\u00020e*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020;0:H\u0007¢\u0006\u0003\b\u0087\u0001J%\u0010\u0085\u0001\u001a\u00020e*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0:H\u0007¢\u0006\u0003\b\u0088\u0001J(\u0010\u0089\u0001\u001a\u00020e*\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020S0Q2\u0006\u0010\u0005\u001a\u00020RH\u0087\n¢\u0006\u0003\b\u008a\u0001J0\u0010\u0089\u0001\u001a\u00020e*\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020S0Q2\u000e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020R0\u0083\u0001H\u0087\n¢\u0006\u0003\b\u008b\u0001J6\u0010\u008c\u0001\u001a\u00020e*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020;0:2\u0007\u0010\u008d\u0001\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0003\b\u008e\u0001J6\u0010\u008c\u0001\u001a\u00020e*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0:2\u0007\u0010\u008d\u0001\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001bH\u0007¢\u0006\u0003\b\u008f\u0001J;\u0010\u0090\u0001\u001a\u00020e*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020;0:2\u0014\u0010\u0091\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u0092\u0001H\u0007¢\u0006\u0003\b\u0093\u0001J;\u0010\u0090\u0001\u001a\u00020e*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0:2\u0014\u0010\u0091\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u0092\u0001H\u0007¢\u0006\u0003\b\u0094\u0001J.\u0010\u0095\u0001\u001a\u00020e*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020;0:2\u0007\u0010\u008d\u0001\u001a\u00020\u001bH\u0007¢\u0006\u0003\b\u0096\u0001J.\u0010\u0095\u0001\u001a\u00020e*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0:2\u0007\u0010\u008d\u0001\u001a\u00020\u001bH\u0007¢\u0006\u0003\b\u0097\u0001J1\u0010\u0098\u0001\u001a\u00020e*\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020S0Q2\u0007\u0010\u0099\u0001\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020RH\u0087\u0002¢\u0006\u0003\b\u009a\u0001J7\u0010\u0098\u0001\u001a\u00020e*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020;0:2\u0007\u0010\u008d\u0001\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\fH\u0087\n¢\u0006\u0003\b\u009b\u0001J7\u0010\u0098\u0001\u001a\u00020e*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0:2\u0007\u0010\u008d\u0001\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001bH\u0087\n¢\u0006\u0003\b\u009c\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R$\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020*8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00100\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010\u0011R$\u00103\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u000f\"\u0004\b5\u0010\u0011R$\u00106\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R#\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020;0:8G¢\u0006\u0006\u001a\u0004\b<\u0010=R$\u0010?\u001a\u00020>2\u0006\u0010\u0005\u001a\u00020>8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010D\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010\u001e\"\u0004\bF\u0010 R$\u0010G\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010\u001e\"\u0004\bI\u0010 R$\u0010J\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010\u001e\"\u0004\bL\u0010 R#\u0010M\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0:8G¢\u0006\u0006\u001a\u0004\bO\u0010=R\u001d\u0010P\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020S0Q8F¢\u0006\u0006\u001a\u0004\bT\u0010UR$\u0010W\u001a\u00020V2\u0006\u0010\u0005\u001a\u00020V8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010]\u001a\u00020\\2\u0006\u0010\u0005\u001a\u00020\\8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a¨\u0006¡\u0001"}, m43475d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder;", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder;)V", "value", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "", "adFormatValue", "getAdFormatValue", "()I", "setAdFormatValue", "(I)V", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "getAdType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "setAdType", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;)V", "adTypeValue", "getAdTypeValue", "setAdTypeValue", "", "customEventType", "getCustomEventType", "()Ljava/lang/String;", "setCustomEventType", "(Ljava/lang/String;)V", "Lcom/google/protobuf/ByteString;", "errorToken", "getErrorToken", "()Lcom/google/protobuf/ByteString;", "setErrorToken", "(Lcom/google/protobuf/ByteString;)V", "eventId", "getEventId", "setEventId", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "eventType", "getEventType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "setEventType", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;)V", "eventTypeValue", "getEventTypeValue", "setEventTypeValue", "headerBiddingTokenNumber", "getHeaderBiddingTokenNumber", "setHeaderBiddingTokenNumber", "impressionOpportunityId", "getImpressionOpportunityId", "setImpressionOpportunityId", "intTags", "Lcom/google/protobuf/kotlin/DslMap;", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$IntTagsProxy;", "getIntTagsMap", "()Lcom/google/protobuf/kotlin/DslMap;", "", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "getIsHeaderBidding", "()Z", "setIsHeaderBidding", "(Z)V", "placementId", "getPlacementId", "setPlacementId", "reason", "getReason", "setReason", "reasonDebug", "getReasonDebug", "setReasonDebug", "stringTags", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$StringTagsProxy;", "getStringTagsMap", "tags", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag;", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$TagsProxy;", "getTags", "()Lcom/google/protobuf/kotlin/DslList;", "", "timeValue", "getTimeValue", "()D", "setTimeValue", "(D)V", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "timestamps", "getTimestamps", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setTimestamps", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "_build", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "clearAdFormat", "", "clearAdType", "clearCustomEventType", "clearErrorToken", "clearEventId", "clearEventType", "clearHeaderBiddingTokenNumber", "clearImpressionOpportunityId", "clearIsHeaderBidding", "clearPlacementId", "clearReason", "clearReasonDebug", "clearTimeValue", "clearTimestamps", "hasAdFormat", "hasAdType", "hasCustomEventType", "hasErrorToken", "hasHeaderBiddingTokenNumber", "hasImpressionOpportunityId", "hasIsHeaderBidding", "hasPlacementId", "hasReason", "hasReasonDebug", "hasTimeValue", "hasTimestamps", "add", "addTags", "addAll", "values", "", "addAllTags", "clear", "clearTags", "clearIntTags", "clearStringTags", "plusAssign", "plusAssignTags", "plusAssignAllTags", "put", "key", "putIntTags", "putStringTags", "putAll", "map", "", "putAllIntTags", "putAllStringTags", "remove", "removeIntTags", "removeStringTags", "set", "index", "setTags", "setIntTags", "setStringTags", "Companion", "IntTagsProxy", "StringTagsProxy", "TagsProxy", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder _builder;

        /* JADX INFO: compiled from: DiagnosticEventKt.kt */
        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, m43475d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl;", "builder", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* JADX INFO: compiled from: DiagnosticEventKt.kt */
        @Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m43475d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$IntTagsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
        public static final class IntTagsProxy extends DslProxy {
            private IntTagsProxy() {
            }
        }

        /* JADX INFO: compiled from: DiagnosticEventKt.kt */
        @Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m43475d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$StringTagsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
        public static final class StringTagsProxy extends DslProxy {
            private StringTagsProxy() {
            }
        }

        /* JADX INFO: compiled from: DiagnosticEventKt.kt */
        @Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m43475d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$TagsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
        public static final class TagsProxy extends DslProxy {
            private TagsProxy() {
            }
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEvent _build() {
            DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEventBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(diagnosticEventBuild, "_builder.build()");
            return diagnosticEventBuild;
        }

        public final /* synthetic */ void addAllTags(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllTags(values);
        }

        public final /* synthetic */ void addTags(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticTag value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addTags(value);
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdType() {
            this._builder.clearAdType();
        }

        public final void clearCustomEventType() {
            this._builder.clearCustomEventType();
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearHeaderBiddingTokenNumber() {
            this._builder.clearHeaderBiddingTokenNumber();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final /* synthetic */ void clearIntTags(DslMap dslMap) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearIntTags();
        }

        public final void clearIsHeaderBidding() {
            this._builder.clearIsHeaderBidding();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearReason() {
            this._builder.clearReason();
        }

        public final void clearReasonDebug() {
            this._builder.clearReasonDebug();
        }

        public final /* synthetic */ void clearStringTags(DslMap dslMap) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearStringTags();
        }

        public final /* synthetic */ void clearTags(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearTags();
        }

        public final void clearTimeValue() {
            this._builder.clearTimeValue();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            Intrinsics.checkNotNullExpressionValue(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
            DiagnosticEventRequestOuterClass.DiagnosticAdType adType = this._builder.getAdType();
            Intrinsics.checkNotNullExpressionValue(adType, "_builder.getAdType()");
            return adType;
        }

        public final int getAdTypeValue() {
            return this._builder.getAdTypeValue();
        }

        public final String getCustomEventType() {
            String customEventType = this._builder.getCustomEventType();
            Intrinsics.checkNotNullExpressionValue(customEventType, "_builder.getCustomEventType()");
            return customEventType;
        }

        public final ByteString getErrorToken() {
            ByteString errorToken = this._builder.getErrorToken();
            Intrinsics.checkNotNullExpressionValue(errorToken, "_builder.getErrorToken()");
            return errorToken;
        }

        public final int getEventId() {
            return this._builder.getEventId();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticEventType getEventType() {
            DiagnosticEventRequestOuterClass.DiagnosticEventType eventType = this._builder.getEventType();
            Intrinsics.checkNotNullExpressionValue(eventType, "_builder.getEventType()");
            return eventType;
        }

        public final int getEventTypeValue() {
            return this._builder.getEventTypeValue();
        }

        public final int getHeaderBiddingTokenNumber() {
            return this._builder.getHeaderBiddingTokenNumber();
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            Intrinsics.checkNotNullExpressionValue(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final /* synthetic */ DslMap getIntTagsMap() {
            Map<String, Integer> intTagsMap = this._builder.getIntTagsMap();
            Intrinsics.checkNotNullExpressionValue(intTagsMap, "_builder.getIntTagsMap()");
            return new DslMap(intTagsMap);
        }

        public final boolean getIsHeaderBidding() {
            return this._builder.getIsHeaderBidding();
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            Intrinsics.checkNotNullExpressionValue(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final String getReason() {
            String reason = this._builder.getReason();
            Intrinsics.checkNotNullExpressionValue(reason, "_builder.getReason()");
            return reason;
        }

        public final String getReasonDebug() {
            String reasonDebug = this._builder.getReasonDebug();
            Intrinsics.checkNotNullExpressionValue(reasonDebug, "_builder.getReasonDebug()");
            return reasonDebug;
        }

        public final /* synthetic */ DslMap getStringTagsMap() {
            Map<String, String> stringTagsMap = this._builder.getStringTagsMap();
            Intrinsics.checkNotNullExpressionValue(stringTagsMap, "_builder.getStringTagsMap()");
            return new DslMap(stringTagsMap);
        }

        public final /* synthetic */ DslList getTags() {
            List<DiagnosticEventRequestOuterClass.DiagnosticTag> tagsList = this._builder.getTagsList();
            Intrinsics.checkNotNullExpressionValue(tagsList, "_builder.getTagsList()");
            return new DslList(tagsList);
        }

        public final double getTimeValue() {
            return this._builder.getTimeValue();
        }

        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            Intrinsics.checkNotNullExpressionValue(timestamps, "_builder.getTimestamps()");
            return timestamps;
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasAdType() {
            return this._builder.hasAdType();
        }

        public final boolean hasCustomEventType() {
            return this._builder.hasCustomEventType();
        }

        public final boolean hasErrorToken() {
            return this._builder.hasErrorToken();
        }

        public final boolean hasHeaderBiddingTokenNumber() {
            return this._builder.hasHeaderBiddingTokenNumber();
        }

        public final boolean hasImpressionOpportunityId() {
            return this._builder.hasImpressionOpportunityId();
        }

        public final boolean hasIsHeaderBidding() {
            return this._builder.hasIsHeaderBidding();
        }

        public final boolean hasPlacementId() {
            return this._builder.hasPlacementId();
        }

        public final boolean hasReason() {
            return this._builder.hasReason();
        }

        public final boolean hasReasonDebug() {
            return this._builder.hasReasonDebug();
        }

        public final boolean hasTimeValue() {
            return this._builder.hasTimeValue();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final /* synthetic */ void plusAssignAllTags(DslList<DiagnosticEventRequestOuterClass.DiagnosticTag, TagsProxy> dslList, Iterable<DiagnosticEventRequestOuterClass.DiagnosticTag> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllTags(dslList, values);
        }

        public final /* synthetic */ void plusAssignTags(DslList<DiagnosticEventRequestOuterClass.DiagnosticTag, TagsProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticTag value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addTags(dslList, value);
        }

        public final /* synthetic */ void putAllIntTags(DslMap dslMap, Map map) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(map, "map");
            this._builder.putAllIntTags(map);
        }

        public final /* synthetic */ void putAllStringTags(DslMap dslMap, Map map) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(map, "map");
            this._builder.putAllStringTags(map);
        }

        public final void putIntTags(DslMap<String, Integer, IntTagsProxy> dslMap, String key, int i) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            this._builder.putIntTags(key, i);
        }

        public final void putStringTags(DslMap<String, String, StringTagsProxy> dslMap, String key, String value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.putStringTags(key, value);
        }

        public final /* synthetic */ void removeIntTags(DslMap dslMap, String key) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            this._builder.removeIntTags(key);
        }

        public final /* synthetic */ void removeStringTags(DslMap dslMap, String key) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            this._builder.removeStringTags(key);
        }

        public final void setAdFormat(AdFormatOuterClass.AdFormat value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdFormat(value);
        }

        public final void setAdFormatValue(int i) {
            this._builder.setAdFormatValue(i);
        }

        public final void setAdType(DiagnosticEventRequestOuterClass.DiagnosticAdType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdType(value);
        }

        public final void setAdTypeValue(int i) {
            this._builder.setAdTypeValue(i);
        }

        public final void setCustomEventType(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCustomEventType(value);
        }

        public final void setErrorToken(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setErrorToken(value);
        }

        public final void setEventId(int i) {
            this._builder.setEventId(i);
        }

        public final void setEventType(DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setEventType(value);
        }

        public final void setEventTypeValue(int i) {
            this._builder.setEventTypeValue(i);
        }

        public final void setHeaderBiddingTokenNumber(int i) {
            this._builder.setHeaderBiddingTokenNumber(i);
        }

        public final void setImpressionOpportunityId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final /* synthetic */ void setIntTags(DslMap<String, Integer, IntTagsProxy> dslMap, String key, int i) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            putIntTags(dslMap, key, i);
        }

        public final void setIsHeaderBidding(boolean z) {
            this._builder.setIsHeaderBidding(z);
        }

        public final void setPlacementId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void setReason(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setReason(value);
        }

        public final void setReasonDebug(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setReasonDebug(value);
        }

        public final /* synthetic */ void setStringTags(DslMap<String, String, StringTagsProxy> dslMap, String key, String value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            putStringTags(dslMap, key, value);
        }

        public final /* synthetic */ void setTags(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticTag value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTags(i, value);
        }

        public final void setTimeValue(double d) {
            this._builder.setTimeValue(d);
        }

        public final void setTimestamps(TimestampsOuterClass.Timestamps value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTimestamps(value);
        }
    }

    private DiagnosticEventKt() {
    }
}
