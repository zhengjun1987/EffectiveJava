package chapter06;

import java.util.EnumMap;
import java.util.Map;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/26 17:07
 */
public enum Phase {
    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT(Phase.SOLID,Phase.LIQUID),
        FREEZE(Phase.LIQUID,Phase.SOLID),
        BOIL(Phase.LIQUID,Phase.GAS),
        CONDENSE(Phase.GAS,Phase.LIQUID),
        SUBLIME(Phase.SOLID,Phase.GAS),
        DEPOSIT(Phase.GAS,Phase.SOLID);

        private static final Transition[][] sTransitions = {
                {null, MELT, SUBLIME},
                {FREEZE, null, BOIL},
                {DEPOSIT, CONDENSE, null}
        };

        public static Transition from(Phase from, Phase to) {
            return sTransitions[from.ordinal()][to.ordinal()];
        }

        public static Transition fromMap(Phase from, Phase to) {
            return sMap.get(from).get(to);
        }

        private final Phase from;
        private final Phase to;

        Transition(Phase argFrom, Phase argTo) {
            from = argFrom;
            to = argTo;
        }

        private static final Map<Phase,Map<Phase,Transition>> sMap = new EnumMap<Phase, Map<Phase, Transition>>(Phase.class);
        static {
            for (Phase phase : Phase.values()) {
                sMap.put(phase,new EnumMap<Phase, Transition>(Phase.class));
            }
            for (Transition transition : Transition.values()) {
                sMap.get(transition.from).put(transition.to,transition);
            }
        }
    }
}
