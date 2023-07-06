package com.atguigu.crud.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClockExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }
//        clock_id
//                clock_name
//        clock_time
//                clock_status

        public Criteria andClockIdIsNull() {
            addCriterion("clock_id is null");
            return (Criteria) this;
        }

        public Criteria andClockIdIsNotNull() {
            addCriterion("clock_id is not null");
            return (Criteria) this;
        }

        public Criteria andClockIdEqualTo(Integer value) {
            addCriterion("clock_id =", value, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdNotEqualTo(Integer value) {
            addCriterion("clock_id <>", value, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdGreaterThan(Integer value) {
            addCriterion("clock_id >", value, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("clock_id >=", value, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdLessThan(Integer value) {
            addCriterion("clock_id <", value, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdLessThanOrEqualTo(Integer value) {
            addCriterion("clock_id <=", value, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdIn(List<Integer> values) {
            addCriterion("clock_id in", values, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdNotIn(List<Integer> values) {
            addCriterion("clock_id not in", values, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdBetween(Integer value1, Integer value2) {
            addCriterion("clock_id between", value1, value2, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("clock_id not between", value1, value2, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockNameIsNull() {
            addCriterion("clock_name is null");
            return (Criteria) this;
        }

        public Criteria andClockNameIsNotNull() {
            addCriterion("clock_name is not null");
            return (Criteria) this;
        }

        public Criteria andClockNameEqualTo(String value) {
            addCriterion("clock_name =", value, "clockName");
            return (Criteria) this;
        }

        public Criteria andClockNameNotEqualTo(String value) {
            addCriterion("clock_name <>", value, "clockName");
            return (Criteria) this;
        }

        public Criteria andClockNameGreaterThan(String value) {
            addCriterion("clock_name >", value, "clockName");
            return (Criteria) this;
        }

        public Criteria andClockNameGreaterThanOrEqualTo(String value) {
            addCriterion("clock_name >=", value, "clockName");
            return (Criteria) this;
        }

        public Criteria andClockNameLessThan(String value) {
            addCriterion("clock_name <", value, "clockName");
            return (Criteria) this;
        }

        public Criteria andClockNameLessThanOrEqualTo(String value) {
            addCriterion("clock_name <=", value, "clockName");
            return (Criteria) this;
        }

        public Criteria andClockNameLike(String value) {
            addCriterion("clock_name like", value, "clockName");
            return (Criteria) this;
        }

        public Criteria andClockNameNotLike(String value) {
            addCriterion("clock_name not like", value, "clockName");
            return (Criteria) this;
        }

        public Criteria andClockNameIn(List<String> values) {
            addCriterion("clock_name in", values, "clockName");
            return (Criteria) this;
        }

        public Criteria andClockNameNotIn(List<String> values) {
            addCriterion("clock_name not in", values, "clockName");
            return (Criteria) this;
        }

        public Criteria andClockNameBetween(String value1, String value2) {
            addCriterion("clock_name between", value1, value2, "clockName");
            return (Criteria) this;
        }

        public Criteria andClockNameNotBetween(String value1, String value2) {
            addCriterion("clock_name not between", value1, value2, "clockName");
            return (Criteria) this;
        }

        public Criteria andClockStatusIsNull() {
            addCriterion("clock_status is null");
            return (Criteria) this;
        }

        public Criteria andClockStatusIsNotNull() {
            addCriterion("clock_status is not null");
            return (Criteria) this;
        }

        public Criteria andClockStatusEqualTo(String value) {
            addCriterion("clock_status =", value, "clockStatus");
            return (Criteria) this;
        }

        public Criteria andClockStatusNotEqualTo(String value) {
            addCriterion("clock_status <>", value, "clockStatus");
            return (Criteria) this;
        }

        public Criteria andClockStatusGreaterThan(String value) {
            addCriterion("clock_status >", value, "clockStatus");
            return (Criteria) this;
        }

        public Criteria andClockStatusGreaterThanOrEqualTo(String value) {
            addCriterion("clock_status >=", value, "clockStatus");
            return (Criteria) this;
        }

        public Criteria andClockStatusLessThan(String value) {
            addCriterion("clock_status <", value, "clockStatus");
            return (Criteria) this;
        }

        public Criteria andClockStatusLessThanOrEqualTo(String value) {
            addCriterion("clock_status <=", value, "clockStatus");
            return (Criteria) this;
        }

        public Criteria andClockStatusLike(String value) {
            addCriterion("clock_status like", value, "clockStatus");
            return (Criteria) this;
        }

        public Criteria andClockStatusNotLike(String value) {
            addCriterion("clock_status not like", value, "clockStatus");
            return (Criteria) this;
        }

        public Criteria andClockStatusIn(List<String> values) {
            addCriterion("clock_status in", values, "clockStatus");
            return (Criteria) this;
        }

        public Criteria andClockStatusNotIn(List<String> values) {
            addCriterion("clock_status not in", values, "clockStatus");
            return (Criteria) this;
        }

        public Criteria andClockStatusBetween(String value1, String value2) {
            addCriterion("clock_status between", value1, value2, "clockStatus");
            return (Criteria) this;
        }

        public Criteria andClockStatusNotBetween(String value1, String value2) {
            addCriterion("clock_status not between", value1, value2, "clockStatus");
            return (Criteria) this;
        }

        public Criteria andClockTimeIsNull() {
            addCriterion("clock_time is null");
            return (Criteria) this;
        }

        public Criteria andClockTimeIsNotNull() {
            addCriterion("clock_time is not null");
            return (Criteria) this;
        }

        public Criteria andClockTimeEqualTo(Date value) {
            addCriterion("clock_time =", value, "clockTime");
            return (Criteria) this;
        }

        public Criteria andClockTimeNotEqualTo(Date value) {
            addCriterion("clock_time <>", value, "clockTime");
            return (Criteria) this;
        }

        public Criteria andClockTimeGreaterThan(Date value) {
            addCriterion("clock_time >", value, "clockTime");
            return (Criteria) this;
        }

        public Criteria andClockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("clock_time >=", value, "clockTime");
            return (Criteria) this;
        }

        public Criteria andClockTimeLessThan(Date value) {
            addCriterion("clock_time <", value, "clockTime");
            return (Criteria) this;
        }

        public Criteria andClockTimeLessThanOrEqualTo(Date value) {
            addCriterion("clock_time <=", value, "clockTime");
            return (Criteria) this;
        }

        public Criteria andClockTimeLike(Date value) {
            addCriterion("clock_time like", value, "clockTime");
            return (Criteria) this;
        }

        public Criteria andClockTimeNotLike(Date value) {
            addCriterion("clock_time not like", value, "clockTime");
            return (Criteria) this;
        }

        public Criteria andClockTimeIn(List<Date> values) {
            addCriterion("clock_time in", values, "clockTime");
            return (Criteria) this;
        }

        public Criteria andClockTimeNotIn(List<Date> values) {
            addCriterion("clock_time not in", values, "clockTime");
            return (Criteria) this;
        }

        public Criteria andClockTimeBetween(Date value1, Date value2) {
            addCriterion("clock_time between", value1, value2, "clockTime");
            return (Criteria) this;
        }

        public Criteria andClockTimeNotBetween(Date value1, Date value2) {
            addCriterion("clock_time not between", value1, value2, "clockTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}