package com.wyj.library.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("borrowExample")
public class BorrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("isbn is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("isbn is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("isbn =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("isbn <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("isbn >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("isbn >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("isbn <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("isbn <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("isbn like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("isbn not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("isbn in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("isbn not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("isbn between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("isbn not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andReaderNameIsNull() {
            addCriterion("reader_name is null");
            return (Criteria) this;
        }

        public Criteria andReaderNameIsNotNull() {
            addCriterion("reader_name is not null");
            return (Criteria) this;
        }

        public Criteria andReaderNameEqualTo(String value) {
            addCriterion("reader_name =", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameNotEqualTo(String value) {
            addCriterion("reader_name <>", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameGreaterThan(String value) {
            addCriterion("reader_name >", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("reader_name >=", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameLessThan(String value) {
            addCriterion("reader_name <", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameLessThanOrEqualTo(String value) {
            addCriterion("reader_name <=", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameLike(String value) {
            addCriterion("reader_name like", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameNotLike(String value) {
            addCriterion("reader_name not like", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameIn(List<String> values) {
            addCriterion("reader_name in", values, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameNotIn(List<String> values) {
            addCriterion("reader_name not in", values, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameBetween(String value1, String value2) {
            addCriterion("reader_name between", value1, value2, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameNotBetween(String value1, String value2) {
            addCriterion("reader_name not between", value1, value2, "readerName");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Integer value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Integer value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Integer value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Integer value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Integer> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Integer> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Integer value1, Integer value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIsNull() {
            addCriterion("effective_date is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIsNotNull() {
            addCriterion("effective_date is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateEqualTo(String value) {
            addCriterion("effective_date =", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotEqualTo(String value) {
            addCriterion("effective_date <>", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateGreaterThan(String value) {
            addCriterion("effective_date >", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateGreaterThanOrEqualTo(String value) {
            addCriterion("effective_date >=", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLessThan(String value) {
            addCriterion("effective_date <", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLessThanOrEqualTo(String value) {
            addCriterion("effective_date <=", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLike(String value) {
            addCriterion("effective_date like", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotLike(String value) {
            addCriterion("effective_date not like", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIn(List<String> values) {
            addCriterion("effective_date in", values, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotIn(List<String> values) {
            addCriterion("effective_date not in", values, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateBetween(String value1, String value2) {
            addCriterion("effective_date between", value1, value2, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotBetween(String value1, String value2) {
            addCriterion("effective_date not between", value1, value2, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("expire_date is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("expire_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(String value) {
            addCriterion("expire_date =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(String value) {
            addCriterion("expire_date <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(String value) {
            addCriterion("expire_date >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(String value) {
            addCriterion("expire_date >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(String value) {
            addCriterion("expire_date <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(String value) {
            addCriterion("expire_date <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLike(String value) {
            addCriterion("expire_date like", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotLike(String value) {
            addCriterion("expire_date not like", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<String> values) {
            addCriterion("expire_date in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<String> values) {
            addCriterion("expire_date not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(String value1, String value2) {
            addCriterion("expire_date between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(String value1, String value2) {
            addCriterion("expire_date not between", value1, value2, "expireDate");
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