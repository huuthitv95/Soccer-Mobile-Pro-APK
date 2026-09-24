package com.ironsource.adapters.ironsource;

import com.ironsource.C11744X3;
import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface IronSourceLoadParameters {

    public static final class Base implements IronSourceLoadParameters {
        private final JSONObject loadConfig;
        private final String serverData;

        public Base(JSONObject loadConfig, String str) {
            Intrinsics.checkNotNullParameter(loadConfig, "loadConfig");
            this.loadConfig = loadConfig;
            this.serverData = str;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public JSONObject config() {
            return this.loadConfig;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadConfig.optBoolean(Constants.DEMAND_ONLY, false);
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public HashMap<String, String> value() {
            HashMap<String, String> map = new HashMap<>();
            map.put("isOneFlow", String.valueOf(this.loadConfig.optBoolean("isOneFlow")));
            if (this.serverData != null) {
                String strM32335a = C12333d.m32333b().m32335a(this.serverData);
                Intrinsics.checkNotNullExpressionValue(strM32335a, "getInstance().getAdmFromServerData(serverData)");
                map.put("adm", strM32335a);
                map.putAll(C12333d.m32333b().m32341b(this.serverData));
            }
            return map;
        }

        public /* synthetic */ Base(JSONObject jSONObject, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(jSONObject, (i & 2) != 0 ? null : str);
        }
    }

    public static final class Constants {
        public static final String ADM_KEY = "adm";
        public static final String DEMAND_ONLY = "demandOnly";
        public static final Constants INSTANCE = new Constants();
        public static final String ONE_FLOW_KEY = "isOneFlow";

        private Constants() {
        }
    }

    public static final class WithLog implements IronSourceLoadParameters {
        private final IronSourceLoadParameters loadParameters;

        public WithLog(IronSourceLoadParameters loadParameters) {
            Intrinsics.checkNotNullParameter(loadParameters, "loadParameters");
            this.loadParameters = loadParameters;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public JSONObject config() {
            return this.loadParameters.config();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadParameters.demandOnly();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public HashMap<String, String> value() {
            HashMap<String, String> mapValue = this.loadParameters.value();
            if (!mapValue.isEmpty()) {
                IronLog.ADAPTER_API.verbose("instance extra params:");
                for (String str : mapValue.keySet()) {
                    IronLog.ADAPTER_API.verbose(str + C11744X3.j.f26434b + ((Object) mapValue.get(str)));
                }
            }
            return mapValue;
        }
    }

    JSONObject config();

    boolean demandOnly();

    HashMap<String, String> value();
}
