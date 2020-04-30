public class BuilderPattern {
    String bread;
    String condiments;
    String dressing;
    String meat;
    public BuilderPattern(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }
    public static class Builder{
        private String bread;
        private String dressing;
        private String condiments;
        private String meat;
        public Builder(){
        }
        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }
        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }
        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }
        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }
        public BuilderPattern build(){
            return new BuilderPattern(this);
        }
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
