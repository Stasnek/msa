CREATE SCHEMA IF NOT EXISTS easy_wallet;
CREATE TABLE easy_wallet.wallet(
  id BIGSERIAL PRIMARY KEY,
  client_id VARCHAR NOT NULL,
  balance decimal NOT NULL
);