package org.vite.dex.mm.constant.constants;

import java.util.HashMap;
import java.util.Map;

public class MMConst {
        public static final String NODE_SERVER_URL = "https://node-aws.vite.net/gvite/http";

        public static final String TRADE_CONTRACT_ADDRESS = "vite_00000000000000000000000000000000000000079710f19dc7";

        public static final String ORDER_NEW_EVENT_TOPIC =
                        "6e65774f726465724576656e7400000000000000000000000000000000000000";

        public static final String ORDER_UPDATE_EVENT_TOPIC =
                        "6f726465725570646174654576656e7400000000000000000000000000000000";

        public static final String TX_EVENT_TOPIC = "74784576656e7400000000000000000000000000000000000000000000000000";

        public static final String UnderscoreStr = "_";

        public static final int OrderIdBytesLength = 22;

        public static final String UsdDecimal = "0.000000000001";



        public static final float f1 = 0.1;
        public static final float f2 = 0.1;
        public static final float f3 = 0.1;
        public static final float f4 = 0.1;



        public static final Map<Integer, Float> getAllF() {
                return new HashMap<Integer, Float>();
        }

}
