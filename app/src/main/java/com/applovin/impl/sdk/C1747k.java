package com.applovin.impl.sdk;

import android.os.Bundle;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.AbstractC1482a3;
import com.applovin.impl.AbstractC1564g8;
import com.applovin.impl.AbstractC1589j3;
import com.applovin.impl.AbstractC1603k7;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1821y3;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1529d3;
import com.applovin.impl.C1539e3;
import com.applovin.impl.C1549f3;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1585j;
import com.applovin.impl.C1667o0;
import com.applovin.impl.C1831z4;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.network.C1762a;
import com.applovin.impl.sdk.network.C1765d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C11494Ie;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.k */
/* JADX INFO: loaded from: classes3.dex */
public class C1747k implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a */
    private final C1748l f3001a;

    /* JADX INFO: renamed from: b */
    private final AppLovinCommunicator f3002b;

    C1747k(C1748l c1748l) {
        this.f3001a = c1748l;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(C1748l.m4756p());
        this.f3002b = appLovinCommunicator;
        if (((Boolean) c1748l.m4801a(C1831z4.f3992m7)).booleanValue()) {
            appLovinCommunicator.m1757a(c1748l);
            appLovinCommunicator.subscribe(this, AbstractC1603k7.f1980a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
    /* JADX INFO: renamed from: a */
    private Bundle m4699a(AbstractC1482a3 abstractC1482a3) {
        View viewM2576v0;
        Bundle bundle = new Bundle();
        bundle.putString("id", abstractC1482a3.m1833T());
        bundle.putString("network_name", abstractC1482a3.m3200c());
        bundle.putString("max_ad_unit_id", abstractC1482a3.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", abstractC1482a3.m1834U());
        bundle.putString(FirebaseAnalytics.Param.AD_FORMAT, abstractC1482a3.getFormat().getLabel());
        BundleUtils.putStringIfValid(CampaignEx.JSON_KEY_CREATIVE_ID, abstractC1482a3.getCreativeId(), bundle);
        BundleUtils.putStringIfValid("adomain", abstractC1482a3.m1861v(), bundle);
        BundleUtils.putStringIfValid("dsp_name", abstractC1482a3.getDspName(), bundle);
        if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(abstractC1482a3.m3200c())) {
            bundle.putString("custom_sdk_network_name", abstractC1482a3.getNetworkName());
        }
        bundle.putAll(JsonUtils.toBundle(abstractC1482a3.m1864y()));
        if (!(abstractC1482a3 instanceof AbstractC1589j3)) {
            if (abstractC1482a3 instanceof C1539e3) {
                Bundle bundle2 = ((C1539e3) abstractC1482a3).m2480t0().getBundle("applovin_ad_view_info");
                bundle.putString("ad_view", BundleUtils.getString("ad_view_address", "N/A", bundle2));
                bundle.putString("video_view", BundleUtils.getString("video_view_address", "N/A", bundle2));
            }
            return bundle;
        }
        if (abstractC1482a3 instanceof C1529d3) {
            viewM2576v0 = ((C1529d3) abstractC1482a3).m1865z();
        } else if (abstractC1482a3 instanceof C1549f3) {
            C1549f3 c1549f3 = (C1549f3) abstractC1482a3;
            if (c1549f3.m2573A0()) {
                viewM2576v0 = null;
            } else {
                viewM2576v0 = c1549f3.m2576v0() != null ? c1549f3.m2576v0() : c1549f3.m2577w0();
            }
        } else {
            viewM2576v0 = null;
        }
        bundle.putString("ad_view", viewM2576v0 != null ? AbstractC1564g8.m2752a(viewM2576v0) : "N/A");
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    private boolean m4700b(String str) {
        if (((Boolean) this.f3001a.m4801a(C1831z4.f3992m7)).booleanValue()) {
            return this.f3001a.m4821c(C1831z4.f3983l7).contains(str) || this.f3002b.hasSubscriber(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m4701a() {
        if (m4700b("privacy_setting_updated")) {
            m4702a(new Bundle(), "privacy_setting_updated");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4702a(Bundle bundle, String str) {
        if (m4700b(str)) {
            this.f3002b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f3001a.m4821c(C1831z4.f3983l7).contains(str)));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4703a(AbstractC1482a3 abstractC1482a3, String str) {
        if (m4700b("ad_callback_blocked_after_hidden")) {
            Bundle bundleM4699a = m4699a(abstractC1482a3);
            bundleM4699a.putString("callback_name", str);
            m4702a(bundleM4699a, "ad_callback_blocked_after_hidden");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4704a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (m4700b("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            m4702a(bundle, "adapter_initialization_status");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4705a(String str, String str2) {
        if (m4700b("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            m4702a(bundle, "network_sdk_version_updated");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4706a(String str, String str2, int i, Object obj, String str3, boolean z) {
        if (m4700b("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z);
            BundleUtils.putString("error_message", str3, bundle);
            m4702a(bundle, "receive_http_response");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4707a(String str, String str2, String str3) {
        if (m4700b("responses")) {
            String strMaybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String strMaybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", strMaybeConvertToIndentedString);
            bundle.putString(C11494Ie.f24627n, strMaybeConvertToIndentedString2);
            m4702a(bundle, "responses");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4708a(List list) {
        if (m4700b("live_networks_updated")) {
            if (list == null || list.isEmpty()) {
                m4702a(Bundle.EMPTY, "live_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("live_networks", new ArrayList<>(list));
            m4702a(bundle, "live_networks_updated");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4709a(JSONObject jSONObject, boolean z) {
        if (m4700b("safedk_init") && C1585j.m2944c()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3001a.m4839k0());
            bundle.putString("applovin_random_token", this.f3001a.m4837j0());
            bundle.putString("compass_random_token", this.f3001a.m4858v());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(C1748l.m4756p()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(AbstractC1821y3.m5704b(this.f3001a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f3001a.m4865y0().m3898e());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f3001a.m4801a(C1831z4.f4001n7)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, "deactivated", true);
                JsonUtils.putJSONObject(jSONObject3, "safeDKDeactivation", jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.f3001a.m4782Q();
            if (C1768p.m5160a()) {
                this.f3001a.m4782Q().m5171a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            m4702a(bundle2, "safedk_init");
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m4710a(String str) {
        return AbstractC1603k7.f1980a.contains(str);
    }

    /* JADX INFO: renamed from: b */
    public void m4711b(AbstractC1482a3 abstractC1482a3) {
        if (m4700b("max_revenue_events")) {
            Bundle bundleM4699a = m4699a(abstractC1482a3);
            bundleM4699a.putAll(JsonUtils.toBundle(abstractC1482a3.m1832S()));
            bundleM4699a.putString("country_code", this.f3001a.m4860w().getCountryCode());
            m4702a(bundleM4699a, "max_revenue_events");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4712b(AbstractC1482a3 abstractC1482a3, String str) {
        if (m4700b("max_ad_events")) {
            Bundle bundleM4699a = m4699a(abstractC1482a3);
            bundleM4699a.putString("type", str);
            this.f3001a.m4782Q();
            if (C1768p.m5160a()) {
                this.f3001a.m4782Q().m5171a("CommunicatorService", "Sending \"max_ad_events\" message: " + bundleM4699a);
            }
            m4702a(bundleM4699a, "max_ad_events");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4713b(String str, String str2) {
        if (m4700b("user_info") && C1585j.m2944c()) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            m4702a(bundle, "user_info");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4714b(List list) {
        if (m4700b("test_mode_networks_updated")) {
            if (list == null || list.isEmpty()) {
                m4702a(Bundle.EMPTY, "test_mode_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("test_mode_networks", new ArrayList<>(list));
            m4702a(bundle, "test_mode_networks_updated");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        Map<String, Object> map2;
        if (((Boolean) this.f3001a.m4801a(C1831z4.f3992m7)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map3 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map3.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map3.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3001a.m4839k0());
                }
                this.f3001a.m4833h0().m5073e(new C1765d.b().m5116d(messageData.getString("url")).m5106a(messageData.getString("backup_url")).m5111b(stringMap).m5114c(map3).m5107a(stringMap2).m5108a(((Boolean) this.f3001a.m4801a(C1831z4.f3999n5)).booleanValue()).m5110b(string).m5109a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f3001a.m4840l().addCustomQueryParams(AbstractC1701q7.m4042a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f3001a.m4840l().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.f3001a.m4797Z().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f3001a.m4801a(C1831z4.f3988m3)).longValue();
            int i = messageData2.getInt("retry_count", ((Integer) this.f3001a.m4801a(C1831z4.f3997n3)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f3001a.m4801a(C1831z4.f4006o3)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    map2 = null;
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f3001a.m4759B().m4941a((Map) null, false, false))));
                } else {
                    map2 = null;
                }
                millis = millis;
                i = i;
                map = map2;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    Map mapM4933G = this.f3001a.m4759B().m4933G();
                    Map mapM4947p = this.f3001a.m4759B().m4947p();
                    if (mapM4947p.containsKey("idfv") && mapM4947p.containsKey("idfv_scope")) {
                        String str = (String) mapM4947p.get("idfv");
                        Integer num = (Integer) mapM4947p.get("idfv_scope");
                        num.intValue();
                        mapM4947p.remove("idfv");
                        mapM4947p.remove("idfv_scope");
                        mapM4933G.put("idfv", str);
                        mapM4933G.put("idfv_scope", num);
                    }
                    mapM4933G.put("server_installed_at", this.f3001a.m4801a(C1831z4.f4002o));
                    mapM4933G.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3001a.m4839k0());
                    map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, mapM4933G);
                    map.put(C11744X3.i.f26328G, mapM4947p);
                } else {
                    millis = millis;
                    i = i;
                }
            }
            this.f3001a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1667o0(appLovinCommunicatorMessage.getPublisherId(), C1762a.m5013a(this.f3001a).mo5045b(messageData2.getString("url")).mo5039a(messageData2.getString("backup_url")).mo5046b(stringMap3).mo5049c(string2).mo5040a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).mo5041a(map != null ? new JSONObject(map) : null).mo5048c((int) millis).mo5036a(i).mo5044b((int) millis2).mo5038a((Object) new JSONObject()).mo5042a(messageData2.getBoolean("is_encoding_enabled", false)).mo5043a(), this.f3001a), C1552f6.b.OTHER);
        }
    }
}
