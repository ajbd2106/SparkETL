// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Dec 27 17:11:20 GMT 2020
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer txnno;
  public Integer get_txnno() {
    return txnno;
  }
  public void set_txnno(Integer txnno) {
    this.txnno = txnno;
  }
  public QueryResult with_txnno(Integer txnno) {
    this.txnno = txnno;
    return this;
  }
  private String txndata;
  public String get_txndata() {
    return txndata;
  }
  public void set_txndata(String txndata) {
    this.txndata = txndata;
  }
  public QueryResult with_txndata(String txndata) {
    this.txndata = txndata;
    return this;
  }
  private Integer custno;
  public Integer get_custno() {
    return custno;
  }
  public void set_custno(Integer custno) {
    this.custno = custno;
  }
  public QueryResult with_custno(Integer custno) {
    this.custno = custno;
    return this;
  }
  private Double amount;
  public Double get_amount() {
    return amount;
  }
  public void set_amount(Double amount) {
    this.amount = amount;
  }
  public QueryResult with_amount(Double amount) {
    this.amount = amount;
    return this;
  }
  private String category;
  public String get_category() {
    return category;
  }
  public void set_category(String category) {
    this.category = category;
  }
  public QueryResult with_category(String category) {
    this.category = category;
    return this;
  }
  private String product;
  public String get_product() {
    return product;
  }
  public void set_product(String product) {
    this.product = product;
  }
  public QueryResult with_product(String product) {
    this.product = product;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public QueryResult with_city(String city) {
    this.city = city;
    return this;
  }
  private String state;
  public String get_state() {
    return state;
  }
  public void set_state(String state) {
    this.state = state;
  }
  public QueryResult with_state(String state) {
    this.state = state;
    return this;
  }
  private String spendby;
  public String get_spendby() {
    return spendby;
  }
  public void set_spendby(String spendby) {
    this.spendby = spendby;
  }
  public QueryResult with_spendby(String spendby) {
    this.spendby = spendby;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.txnno == null ? that.txnno == null : this.txnno.equals(that.txnno));
    equal = equal && (this.txndata == null ? that.txndata == null : this.txndata.equals(that.txndata));
    equal = equal && (this.custno == null ? that.custno == null : this.custno.equals(that.custno));
    equal = equal && (this.amount == null ? that.amount == null : this.amount.equals(that.amount));
    equal = equal && (this.category == null ? that.category == null : this.category.equals(that.category));
    equal = equal && (this.product == null ? that.product == null : this.product.equals(that.product));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.spendby == null ? that.spendby == null : this.spendby.equals(that.spendby));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.txnno == null ? that.txnno == null : this.txnno.equals(that.txnno));
    equal = equal && (this.txndata == null ? that.txndata == null : this.txndata.equals(that.txndata));
    equal = equal && (this.custno == null ? that.custno == null : this.custno.equals(that.custno));
    equal = equal && (this.amount == null ? that.amount == null : this.amount.equals(that.amount));
    equal = equal && (this.category == null ? that.category == null : this.category.equals(that.category));
    equal = equal && (this.product == null ? that.product == null : this.product.equals(that.product));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.spendby == null ? that.spendby == null : this.spendby.equals(that.spendby));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.txnno = JdbcWritableBridge.readInteger(1, __dbResults);
    this.txndata = JdbcWritableBridge.readString(2, __dbResults);
    this.custno = JdbcWritableBridge.readInteger(3, __dbResults);
    this.amount = JdbcWritableBridge.readDouble(4, __dbResults);
    this.category = JdbcWritableBridge.readString(5, __dbResults);
    this.product = JdbcWritableBridge.readString(6, __dbResults);
    this.city = JdbcWritableBridge.readString(7, __dbResults);
    this.state = JdbcWritableBridge.readString(8, __dbResults);
    this.spendby = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.txnno = JdbcWritableBridge.readInteger(1, __dbResults);
    this.txndata = JdbcWritableBridge.readString(2, __dbResults);
    this.custno = JdbcWritableBridge.readInteger(3, __dbResults);
    this.amount = JdbcWritableBridge.readDouble(4, __dbResults);
    this.category = JdbcWritableBridge.readString(5, __dbResults);
    this.product = JdbcWritableBridge.readString(6, __dbResults);
    this.city = JdbcWritableBridge.readString(7, __dbResults);
    this.state = JdbcWritableBridge.readString(8, __dbResults);
    this.spendby = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(txnno, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(txndata, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(custno, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(amount, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(category, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(spendby, 9 + __off, 12, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(txnno, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(txndata, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(custno, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(amount, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(category, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(spendby, 9 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.txnno = null;
    } else {
    this.txnno = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.txndata = null;
    } else {
    this.txndata = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.custno = null;
    } else {
    this.custno = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.amount = null;
    } else {
    this.amount = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.category = null;
    } else {
    this.category = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product = null;
    } else {
    this.product = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city = null;
    } else {
    this.city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.state = null;
    } else {
    this.state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.spendby = null;
    } else {
    this.spendby = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.txnno) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.txnno);
    }
    if (null == this.txndata) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, txndata);
    }
    if (null == this.custno) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.custno);
    }
    if (null == this.amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amount);
    }
    if (null == this.category) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category);
    }
    if (null == this.product) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.spendby) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, spendby);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.txnno) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.txnno);
    }
    if (null == this.txndata) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, txndata);
    }
    if (null == this.custno) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.custno);
    }
    if (null == this.amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amount);
    }
    if (null == this.category) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category);
    }
    if (null == this.product) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.spendby) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, spendby);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(txnno==null?"null":"" + txnno, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(txndata==null?"null":txndata, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(custno==null?"null":"" + custno, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amount==null?"null":"" + amount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category==null?"null":category, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product==null?"null":product, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(spendby==null?"null":spendby, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(txnno==null?"null":"" + txnno, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(txndata==null?"null":txndata, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(custno==null?"null":"" + custno, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amount==null?"null":"" + amount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category==null?"null":category, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product==null?"null":product, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(spendby==null?"null":spendby, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.txnno = null; } else {
      this.txnno = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.txndata = null; } else {
      this.txndata = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.custno = null; } else {
      this.custno = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amount = null; } else {
      this.amount = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.category = null; } else {
      this.category = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product = null; } else {
      this.product = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.spendby = null; } else {
      this.spendby = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.txnno = null; } else {
      this.txnno = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.txndata = null; } else {
      this.txndata = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.custno = null; } else {
      this.custno = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amount = null; } else {
      this.amount = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.category = null; } else {
      this.category = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product = null; } else {
      this.product = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.spendby = null; } else {
      this.spendby = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("txnno", this.txnno);
    __sqoop$field_map.put("txndata", this.txndata);
    __sqoop$field_map.put("custno", this.custno);
    __sqoop$field_map.put("amount", this.amount);
    __sqoop$field_map.put("category", this.category);
    __sqoop$field_map.put("product", this.product);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("spendby", this.spendby);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("txnno", this.txnno);
    __sqoop$field_map.put("txndata", this.txndata);
    __sqoop$field_map.put("custno", this.custno);
    __sqoop$field_map.put("amount", this.amount);
    __sqoop$field_map.put("category", this.category);
    __sqoop$field_map.put("product", this.product);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("spendby", this.spendby);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("txnno".equals(__fieldName)) {
      this.txnno = (Integer) __fieldVal;
    }
    else    if ("txndata".equals(__fieldName)) {
      this.txndata = (String) __fieldVal;
    }
    else    if ("custno".equals(__fieldName)) {
      this.custno = (Integer) __fieldVal;
    }
    else    if ("amount".equals(__fieldName)) {
      this.amount = (Double) __fieldVal;
    }
    else    if ("category".equals(__fieldName)) {
      this.category = (String) __fieldVal;
    }
    else    if ("product".equals(__fieldName)) {
      this.product = (String) __fieldVal;
    }
    else    if ("city".equals(__fieldName)) {
      this.city = (String) __fieldVal;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
    }
    else    if ("spendby".equals(__fieldName)) {
      this.spendby = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("txnno".equals(__fieldName)) {
      this.txnno = (Integer) __fieldVal;
      return true;
    }
    else    if ("txndata".equals(__fieldName)) {
      this.txndata = (String) __fieldVal;
      return true;
    }
    else    if ("custno".equals(__fieldName)) {
      this.custno = (Integer) __fieldVal;
      return true;
    }
    else    if ("amount".equals(__fieldName)) {
      this.amount = (Double) __fieldVal;
      return true;
    }
    else    if ("category".equals(__fieldName)) {
      this.category = (String) __fieldVal;
      return true;
    }
    else    if ("product".equals(__fieldName)) {
      this.product = (String) __fieldVal;
      return true;
    }
    else    if ("city".equals(__fieldName)) {
      this.city = (String) __fieldVal;
      return true;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
      return true;
    }
    else    if ("spendby".equals(__fieldName)) {
      this.spendby = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
