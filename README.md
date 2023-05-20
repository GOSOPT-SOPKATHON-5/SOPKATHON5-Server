# SOPKATHON5-Server

## service
---

🔔 서비스 이름: 

🔔 소개 : 

<br/><br/>


## 각자 맡은 부분
---

- 현정 : 프로젝트 세팅, ERD 작성, API 명세서 작성
- 성은 : ERD 작성, API 명세서 작성

<br/><br/>


## 1. Foldering
---

```
.
└── src 
    └─ main
        └─ java
            └─ com.sopkathon.server
                ├── common
                ├── config
                ├── service
                ├── controller
                ├── domain
                ├── dto
                ├── repository
                └── ServerApplication
        └─ resources
                └── application.yaml
        └─ test
                └── java
                    └── com.sopkathon.server
                        └── ServerApplicationTests
```
<br/><br/>


## Git convention
---
### ✔️ Commit Convention

- ✅ `[CHORE]` : 동작에 영향 없는 코드 or 변경 없는 변경사항(주석 추가 등)
- ✨ `[FEAT]` : 새로운 기능 구현
- ➕ `[ADD]` : Feat 이외의 부수적인 코드 추가, 라이브러리 추가, 새로운 파일 생성
- 🔨 `[FIX]` : 버그, 오류 해결
- ⚰️ `[DEL]` : 쓸모없는 코드 삭제
- 📝 `[DOCS]` : README나 WIKI 등의 문서 수정
- ✏️ `[CORRECT]` : 주로 문법의 오류나 타입의 변경, 이름 변경시
- ⏪️ `[RENAME]` : 파일 이름 변경시
- ♻️ `[REFACTOR]` : 전면 수정
- 🔀 `[MERGE]`: 다른 브랜치와 병합

ex) commit -m "[FEAT] user API 구현"

### ✔️ Branch Convention

- [feat] : 기능 추가
- [fix] : 에러 수정, 버그 수정
- [docs] : README, 문서
- [refactor] : 코드 리펙토링 (기능 변경 없이 코드만 수정할 때)
- [modify] : 코드 수정 (기능의 변화가 있을 때)
- [chore] : gradle 세팅, 위의 것 이외에 거의 모든 것

ex) feat/#9-user-api

### 브랜치 전략

- `main` : 메인 브랜치
- `main`에 직접적인 commit, push는 가급적 금지합니다
- 작업 전, 반드시 `main` 브랜치를 pull 받고 시작합니다
  `git pull origin main`
- 기능 개발 시 issue를 만듭니다.
- 기능 개발 시 `feature/기능` 브랜치를 파서 관리합니다
  `git branch feature/#이슈번호-api설명`
- 작은 기능별로 `commit message rules`에 따라 커밋을 진행합니다
- 작업 완료 시 `main` 브랜치로 Pull Request를 보냅니다
- 팀원과 코드리뷰를 진행한 후, 최종적으로 `main` 브랜치로 merge합니다
- 다 쓴 브랜치는 삭제합니다

<br/><br/>

### ✔️ Code Convention
---

 <details>  <summary>1. 변수</summary>  
 <div markdown="1"> 
 <br>
     1-1. camelCase 형식을 사용합니다.<br><br>
     1-2. 이름은 짧지만 의미 있어야 합니다.(사용 의도를 누구나 알아낼 수 있도록!)<br><br>
     1-3. ENUM이나 상수는 대문자로 표기합니다.<br><br>
 </div>  </details>

 <details>  <summary>2. 함수</summary>  
 <div markdown="1"> 
 <br>
 2-1. 함수의 이름은 동사여야 하며, camelCase 형식을 사용합니다. <br><br>
     2-2. 객체 이름을 함수 이름에 중복적으로 사용하지 않습니다.<br><br>
     </div>  </details>

 <details>  <summary>3. 클래스 </summary>  
 <div markdown="1"> 
 <br>
 클래스 이름은 명사이어야 하며 Pascal Case를 사용합니다.
     </div>  </details>

 <details>  <summary>4. 인터페이스 </summary>  
 <div markdown="1"> 
 <br>
 클래스와 같은 규칙을 사용합니다.
     </div>  </details>

<br/><br/>

## API DOCS
---

> API 명세서 링크: 

API 명세서 : https://glass-pisces-91b.notion.site/API-e7a25267d2794a269dec5c5adaf18663

<br/><br/>

## ERD
---
<img width="474" alt="image" src="https://github.com/GOSOPT-SOPKATHON-5/SOPKATHON5-Server/assets/81394850/400a0e75-57e5-46d1-b57a-a58e28554863">

## API 테스트

![image](https://github.com/GOSOPT-SOPKATHON-5/SOPKATHON5-Server/assets/81394850/768331e5-abec-4168-b9b3-6e017fa38685)


## 5조의 힘
<img width="546" alt="image" src="https://github.com/GOSOPT-SOPKATHON-5/SOPKATHON5-Server/assets/81394850/a24192fa-4eb3-4693-8c28-fb6021466970">

5조가 짱이다!!!!!!!!!!!!!!

