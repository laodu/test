-- Create the user
create user zsmn
  identified by zsmn
  default tablespace USERS
  temporary tablespace TEMP
  profile DEFAULT;
-- Grant/Revoke role privileges
grant dba to zsmn;
grant connect to zsmn;
grant resource to zsmn;

-- Create table
create table GOODS
(
  id    NUMBER not null,
  goods_name  VARCHAR2(20),
  goods_brand VARCHAR2(20),
  goods_price NUMBER,
  goods_place VARCHAR2(20)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
-- Add comments to the columns
comment on column GOODS.id
  is '商品编号';
comment on column GOODS.goods_name
  is '商品名称';
comment on column GOODS.goods_brand
  is '品牌';
comment on column GOODS.goods_price
  is '价格';
comment on column GOODS.goods_place
  is '产地';
-- Create/Recreate primary, unique and foreign key constraints
alter table GOODS
  add constraint ID primary key (ID)
  using index
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
