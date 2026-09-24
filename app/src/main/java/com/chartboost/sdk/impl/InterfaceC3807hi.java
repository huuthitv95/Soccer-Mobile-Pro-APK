package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.hi */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC3807hi {

    /* JADX INFO: renamed from: a */
    public static final c f14417a = c.f14436a;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hi$a */
    /* JADX INFO: loaded from: classes3.dex */
    public enum a implements InterfaceC3807hi {
        IGNORED("cache_ignored"),
        START("cache_start"),
        FINISH_SUCCESS("cache_finish_success"),
        FINISH_FAILURE("cache_finish_failure"),
        GET_RESPONSE_PARSING_ERROR("cache_get_response_parsing_error"),
        BID_RESPONSE_PARSING_ERROR("cache_bid_response_parsing_error"),
        ASSET_DOWNLOAD_ERROR("cache_asset_download_error"),
        REQUEST_ERROR("cache_request_error"),
        SERVER_ERROR("cache_server_error");


        /* JADX INFO: renamed from: m */
        public static final /* synthetic */ EnumEntries f14428m = EnumEntriesKt.enumEntries(m17896a());

        /* JADX INFO: renamed from: b */
        public final String f14429b;

        a(String str) {
            this.f14429b = str;
        }

        /* JADX INFO: renamed from: b */
        public static EnumEntries m17897b() {
            return f14428m;
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3807hi
        public String getValue() {
            return this.f14429b;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hi$b */
    /* JADX INFO: loaded from: classes3.dex */
    public enum b implements InterfaceC3807hi {
        SUCCESS("click_success"),
        FAILURE("click_failure"),
        INVALID_URL_ERROR("click_invalid_url_error");


        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ EnumEntries f14434g = EnumEntriesKt.enumEntries(m17898a());

        /* JADX INFO: renamed from: b */
        public final String f14435b;

        b(String str) {
            this.f14435b = str;
        }

        /* JADX INFO: renamed from: b */
        public static EnumEntries m17899b() {
            return f14434g;
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3807hi
        public String getValue() {
            return this.f14435b;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hi$c */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ c f14436a = new c();

        /* JADX INFO: renamed from: b */
        public static final Lazy f14437b = LazyKt.lazy(a.f14438b);

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.hi$c$a */
        public static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b */
            public static final a f14438b = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return ArraysKt.flatten(new Object[][]{a.m17897b().toArray(new a[0]), i.m17913b().toArray(new i[0]), b.m17899b().toArray(new b[0]), d.m17904b().toArray(new d[0]), g.m17909b().toArray(new g[0]), h.m17911b().toArray(new h[0]), j.m17915b().toArray(new j[0]), f.m17907b().toArray(new f[0])});
            }
        }

        /* JADX INFO: renamed from: a */
        public final List m17900a() {
            return (List) f14437b.getValue();
        }

        /* JADX INFO: renamed from: a */
        public final List m17901a(List values) {
            Intrinsics.checkNotNullParameter(values, "values");
            List listM17900a = m17900a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM17900a) {
                if (values.contains(((InterfaceC3807hi) obj).getValue())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hi$d */
    /* JADX INFO: loaded from: classes3.dex */
    public enum d implements InterfaceC3807hi {
        SUBCLASSING_ERROR("consent_subclassing_error"),
        DECODING_ERROR("consent_decoding_error"),
        CREATION_ERROR("consent_creation_error"),
        PERSISTED_DATA_READING_ERROR("consent_persisted_data_reading_error"),
        PERSISTENCE_ERROR("consent_persistence_error");


        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ EnumEntries f14445i = EnumEntriesKt.enumEntries(m17903a());

        /* JADX INFO: renamed from: b */
        public final String f14446b;

        d(String str) {
            this.f14446b = str;
        }

        /* JADX INFO: renamed from: b */
        public static EnumEntries m17904b() {
            return f14445i;
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3807hi
        public String getValue() {
            return this.f14446b;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hi$e */
    /* JADX INFO: loaded from: classes3.dex */
    public enum e implements InterfaceC3807hi {
        IMPRESSION_TRACKER_FAILURE("imptracker_failure");


        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ EnumEntries f14449e = EnumEntriesKt.enumEntries(m17905a());

        /* JADX INFO: renamed from: b */
        public final String f14450b;

        e(String str) {
            this.f14450b = str;
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3807hi
        public String getValue() {
            return this.f14450b;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hi$f */
    /* JADX INFO: loaded from: classes3.dex */
    public enum f implements InterfaceC3807hi {
        USER_AGENT_UPDATE_ERROR("user_agent_update_error"),
        PREFETCH_REQUEST_ERROR("prefetch_request_error"),
        CONFIG_REQUEST_ERROR("config_request_error"),
        INSTALL_REQUEST_ERROR("install_request_error"),
        IMPRESSION_RECORDED("impression_recorded"),
        UNSUPPORTED_OS_VERSION("unsupported_os_version"),
        TOO_MANY_EVENTS("too_many_events");


        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ EnumEntries f14459k = EnumEntriesKt.enumEntries(m17906a());

        /* JADX INFO: renamed from: b */
        public final String f14460b;

        f(String str) {
            this.f14460b = str;
        }

        /* JADX INFO: renamed from: b */
        public static EnumEntries m17907b() {
            return f14459k;
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3807hi
        public String getValue() {
            return this.f14460b;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hi$g */
    /* JADX INFO: loaded from: classes3.dex */
    public enum g implements InterfaceC3807hi {
        SUCCESS("navigation_success"),
        FAILURE("navigation_failure");


        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ EnumEntries f14464f = EnumEntriesKt.enumEntries(m17908a());

        /* JADX INFO: renamed from: b */
        public final String f14465b;

        g(String str) {
            this.f14465b = str;
        }

        /* JADX INFO: renamed from: b */
        public static EnumEntries m17909b() {
            return f14464f;
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3807hi
        public String getValue() {
            return this.f14465b;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hi$h */
    /* JADX INFO: loaded from: classes3.dex */
    public enum h implements InterfaceC3807hi {
        REQUEST_JSON_SERIALIZATION_ERROR("request_json_serialization_error"),
        RESPONSE_JSON_SERIALIZATION_ERROR("response_json_serialization_error"),
        RESPONSE_DATA_WRITE_ERROR("response_data_write_error"),
        DISPATCHER_EXCEPTION("network_failure_dispatcher_exception");


        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ EnumEntries f14471h = EnumEntriesKt.enumEntries(m17910a());

        /* JADX INFO: renamed from: b */
        public final String f14472b;

        h(String str) {
            this.f14472b = str;
        }

        /* JADX INFO: renamed from: b */
        public static EnumEntries m17911b() {
            return f14471h;
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3807hi
        public String getValue() {
            return this.f14472b;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hi$i */
    /* JADX INFO: loaded from: classes3.dex */
    public enum i implements InterfaceC3807hi {
        START("show_start"),
        FINISH_SUCCESS("show_finish_success"),
        FINISH_FAILURE("show_finish_failure"),
        UNAVAILABLE_ASSET_ERROR("show_unavailable_asset_error"),
        TIMEOUT_EVENT("show_timeout_error"),
        HTML_MISSING_MUSTACHE_ERROR("show_html_missing_mustache_error"),
        WEBVIEW_SSL_ERROR("show_webview_ssl_error"),
        WEBVIEW_ERROR("show_webview_error"),
        WEBVIEW_CRASH("show_webview_crash"),
        UNEXPECTED_DISMISS_ERROR("show_unexpected_dismiss_error"),
        REQUEST_ERROR("show_request_error"),
        CLOSE_BEFORE_TEMPLATE_SHOW_ERROR("show_close_before_template_show_error"),
        DISMISS_MISSING("dismiss_missing");


        /* JADX INFO: renamed from: q */
        public static final /* synthetic */ EnumEntries f14487q = EnumEntriesKt.enumEntries(m17912a());

        /* JADX INFO: renamed from: b */
        public final String f14488b;

        i(String str) {
            this.f14488b = str;
        }

        /* JADX INFO: renamed from: b */
        public static EnumEntries m17913b() {
            return f14487q;
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3807hi
        public String getValue() {
            return this.f14488b;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hi$j */
    /* JADX INFO: loaded from: classes3.dex */
    public enum j implements InterfaceC3807hi {
        FINISH_SUCCESS("video_finish_success"),
        FINISH_FAILURE("video_finish_failure");


        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ EnumEntries f14492f = EnumEntriesKt.enumEntries(m17914a());

        /* JADX INFO: renamed from: b */
        public final String f14493b;

        j(String str) {
            this.f14493b = str;
        }

        /* JADX INFO: renamed from: b */
        public static EnumEntries m17915b() {
            return f14492f;
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3807hi
        public String getValue() {
            return this.f14493b;
        }
    }

    String getValue();
}
