package chapter02;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/9 17:33
 */
public class NutritionFacts {
    private int servingSize;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    //重叠构造器1
    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    //重叠构造器2
    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    //重叠构造器3
    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    //重叠构造器4
    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize,servings,calories,0);
    }

    //重叠构造器5
    public NutritionFacts(int servingSize, int servings) {
        this(servingSize,servings,0);
    }

    //JavaBean模式:空参构造器,调用setter方法设置参数
    public NutritionFacts() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }


    public static final class NutritionFactsBuilder {
        private int servingSize;
        private int servings;
        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrate;

        private NutritionFactsBuilder() {
        }

        public static NutritionFactsBuilder aNutritionFacts() {
            return new NutritionFactsBuilder();
        }

        public NutritionFactsBuilder servingSize(int servingSize) {
            this.servingSize = servingSize;
            return this;
        }

        public NutritionFactsBuilder servings(int servings) {
            this.servings = servings;
            return this;
        }

        public NutritionFactsBuilder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public NutritionFactsBuilder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public NutritionFactsBuilder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public NutritionFactsBuilder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            NutritionFacts nutritionFacts = new NutritionFacts();
            nutritionFacts.setServingSize(servingSize);
            nutritionFacts.setServings(servings);
            nutritionFacts.setCalories(calories);
            nutritionFacts.setFat(fat);
            nutritionFacts.setSodium(sodium);
            nutritionFacts.setCarbohydrate(carbohydrate);
            return nutritionFacts;
        }
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    public static void main(String[] args) {
        NutritionFactsBuilder nutritionFactsBuilder = new NutritionFactsBuilder();
        nutritionFactsBuilder.servingSize(12)
                .servings(1234)
                .calories(5678)
                .fat(8657)
                .sodium(5545)
                .carbohydrate(555665);
        NutritionFacts nutritionFacts = nutritionFactsBuilder.build();
        System.out.println(MyUtils.getCurrentTime() + "nutritionFacts = " + nutritionFacts);
    }
}
//2018-01-09 17:58:37:360  nutritionFacts = NutritionFacts{servingSize=12, servings=1234, calories=5678, fat=8657, sodium=5545, carbohydrate=555665}
//
//Process finished with exit code 0
